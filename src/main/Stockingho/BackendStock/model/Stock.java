package src.main.Stockingho.BackendStock.model;

public class Stock {
    private int stockID;
    private String stockName;
    private String stockCode;
    private int stockDividendRate;
    private int stockDividendValuePerShare;
    private double stockPrice;


    public Stock(int stockID, String stockName, String stockCode,double stockPrice, int stockDividendRate, int stockDividendValuePerShare) {
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.stockID = stockID;
        this.stockDividendRate = stockDividendRate;
        this.stockDividendValuePerShare = stockDividendValuePerShare;
        this.stockPrice = stockPrice;
    }

    public int getStockID() {
        return stockID;
    }
    public String getStockName() {
        return stockName;
    }
    public String getStockCode() {
        return stockCode;
    }
    public int getStockDividendRate() {
        return stockDividendRate;
    }
    public int getStockDividendValuePerShare() {
        return stockDividendValuePerShare;
    }
    public double getStockPrice() {
        return stockPrice;
    }


    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
    public void setStockID(int stockID) {
        this.stockID = stockID;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public void setStockDividendRate(int stockDividendRate) {
        this.stockDividendRate = stockDividendRate;
    }
    public void setStockDividendValuePerShare(int stockDividendValuePerShare) {
        this.stockDividendValuePerShare = stockDividendValuePerShare;
    }
    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

}
