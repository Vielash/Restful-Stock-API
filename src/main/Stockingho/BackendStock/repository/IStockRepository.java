package src.main.Stockingho.BackendStock.repository;


import src.main.Stockingho.BackendStock.model.Stock;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface IStockRepository {

    //Read Only
    Stock getStockByID(int stockID);
    Stock getStockByCode(String stockCode);
    Collection<Stock> getAllStock();
    List<String> getAllStockCode();


}
