/**
 * 
 */
package com.patrimonio.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrimonio.br.model.Item;

/**
 * @author welinton
 *
 */
public interface ItemRepository extends JpaRepository<Item, Long> {

}
