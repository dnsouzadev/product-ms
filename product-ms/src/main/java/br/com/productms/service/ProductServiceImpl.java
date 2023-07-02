package br.com.productms.service;

import br.com.productms.dto.ProductDTO;
import br.com.productms.model.Product;
import br.com.productms.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;
    @Override
    public Optional<ProductDTO> create(ProductDTO request) {
        ModelMapper mapper = new ModelMapper();
        Product product = mapper.map(request, Product.class);
        repository.saveAndFlush(product);

        ProductDTO response = mapper.map(product, ProductDTO.class);

        return Optional.of(response);

    }

    @Override
    public List<ProductDTO> getAll() {
        ModelMapper mapper = new ModelMapper();
        List<Product> products = repository.findAll();
        List<ProductDTO> responses = new ArrayList<>();

        products.forEach(product -> {
            ProductDTO response = mapper.map(product, ProductDTO.class);
            responses.add(response);
        });

        return responses;
    }

}
