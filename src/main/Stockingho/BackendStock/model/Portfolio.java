package src.main.Stockingho.BackendStock.model;

public class Portfolio {
    private int portfolioID;
    private int userID;
    private int stockID;
    private String stockCode;
    private double stockPrice;
    private double shareNumber;
    private double stockBuyPrice;
    private double totalDividendRate;

    public Portfolio(int portfolioID, int userID, int stockID, String stockCode, double stockPrice, double shareNumber, double stockBuyPrice, double totalDividendRate) {
        this.portfolioID = portfolioID;
        this.userID = userID;
        this.stockID = stockID;
        this.stockCode = stockCode;
        this.stockPrice = stockPrice;
        this.shareNumber = shareNumber;
        this.stockBuyPrice = stockBuyPrice;
        this.totalDividendRate = totalDividendRate;
    }

    public Portfolio(int portfolioID, int stockID, String stockCode, double shareNumber, double stockBuyPrice) {
        this.portfolioID = portfolioID;
        this.stockID = stockID;
        this.stockCode = stockCode;
        this.shareNumber = shareNumber;
        this.stockBuyPrice = stockBuyPrice;
    }

    public String getStockCode() {
        return stockCode;
    }
    public double getStockPrice() {
        return stockPrice;
    }
    public int getStockID() {
        return stockID;
    }
    public int getUserID() {
        return userID;
    }
    public double getShareNumber() {
        return shareNumber;
    }
    public double getStockBuyPrice() {
        return stockBuyPrice;
    }
    public double getTotalDividendRate() {
        return totalDividendRate;
    }
    public int getPortfolioID() {
        return portfolioID;
    }


    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
    public void setStockID(int stockID) {
        this.stockID = stockID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public void setPortfolioID(int portfolioID) {
        this.portfolioID = portfolioID;
    }
    public void setShareNumber(double shareNumber) {
        this.shareNumber = shareNumber;
    }
    public void setStockBuyPrice(double stockBuyPrice) {
        this.stockBuyPrice = stockBuyPrice;
    }
    public void setTotalDividendRate(double totalDividendRate) {
        this.totalDividendRate = totalDividendRate;
    }
}
