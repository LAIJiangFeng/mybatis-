package com.eiot.purchase.model;

public class PurchaseOrder {
    private Integer id;

    private String supplierNo;

    private String gasProduct;

    private String documentNo;

    private String gasSourceLocation;

    private String carNumber;

    private String driver;

    private String loadingTime;

    private Double tare;

    private Double grossWeight;

    private Double netWeight;

    private String unloadingTime;

    private Double unloadingTare;

    private Double unloadingGrossWeight;

    private String settlementMethod;

    private String settlementVolume;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo == null ? null : supplierNo.trim();
    }

    public String getGasProduct() {
        return gasProduct;
    }

    public void setGasProduct(String gasProduct) {
        this.gasProduct = gasProduct == null ? null : gasProduct.trim();
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo == null ? null : documentNo.trim();
    }

    public String getGasSourceLocation() {
        return gasSourceLocation;
    }

    public void setGasSourceLocation(String gasSourceLocation) {
        this.gasSourceLocation = gasSourceLocation == null ? null : gasSourceLocation.trim();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(String loadingTime) {
        this.loadingTime = loadingTime == null ? null : loadingTime.trim();
    }

    public Double getTare() {
        return tare;
    }

    public void setTare(Double tare) {
        this.tare = tare;
    }

    public Double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(Double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(Double netWeight) {
        this.netWeight = netWeight;
    }

    public String getUnloadingTime() {
        return unloadingTime;
    }

    public void setUnloadingTime(String unloadingTime) {
        this.unloadingTime = unloadingTime == null ? null : unloadingTime.trim();
    }

    public Double getUnloadingTare() {
        return unloadingTare;
    }

    public void setUnloadingTare(Double unloadingTare) {
        this.unloadingTare = unloadingTare;
    }

    public Double getUnloadingGrossWeight() {
        return unloadingGrossWeight;
    }

    public void setUnloadingGrossWeight(Double unloadingGrossWeight) {
        this.unloadingGrossWeight = unloadingGrossWeight;
    }

    public String getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod == null ? null : settlementMethod.trim();
    }

    public String getSettlementVolume() {
        return settlementVolume;
    }

    public void setSettlementVolume(String settlementVolume) {
        this.settlementVolume = settlementVolume == null ? null : settlementVolume.trim();
    }
}