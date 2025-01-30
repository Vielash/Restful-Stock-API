package BackendStock.model;

public class Stock {
    private int stockID;
    private String stockName;
    private String stockCode;
    private int stockDividendRate;
    private int stockDividendValuePerShare;


    public Stock(int stockID, String stockName, String stockCode, int stockDividendRate, int stockDividendValuePerShare) {
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.stockID = stockID;
        this.stockDividendRate = stockDividendRate;
        this.stockDividendValuePerShare = stockDividendValuePerShare;
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
}
