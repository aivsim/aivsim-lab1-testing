package task.business;

import java.util.List;

import task.business.exception.DifferentCurrenciesException;
import task.model.Amount;
import task.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}