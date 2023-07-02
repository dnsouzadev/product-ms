package br.com.productms.service;

import br.com.productms.dto.ProductDTO;

import java.util.Optional;

public interface ProductService {
    Optional<ProductDTO> create(ProductDTO request);
}
