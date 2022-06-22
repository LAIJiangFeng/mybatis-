package com.eiot.device.model;

public class DeviceLedger {
    private Integer id;

    private String deviceCode;

    private String deviceType;

    private String deviceName;

    private String specificationAndModel;

    private Integer maintenanceCycle;

    private String nextInspectionDate;

    private String lastOverhaulDate;

    private String overhaulMan;

    private String technicalParameter;

    private String manufacturer;

    private String manufacturerContactAddress;

    private String manufacturerContact;

    private String manufacturerPhoneOne;

    private String manufacturerPhoneTwo;

    private String installDate;

    private String safetyOfficer;

    private String useDate;

    private String assetValue;

    private String remark;

    private String companyCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getSpecificationAndModel() {
        return specificationAndModel;
    }

    public void setSpecificationAndModel(String specificationAndModel) {
        this.specificationAndModel = specificationAndModel == null ? null : specificationAndModel.trim();
    }

    public Integer getMaintenanceCycle() {
        return maintenanceCycle;
    }

    public void setMaintenanceCycle(Integer maintenanceCycle) {
        this.maintenanceCycle = maintenanceCycle;
    }

    public String getNextInspectionDate() {
        return nextInspectionDate;
    }

    public void setNextInspectionDate(String nextInspectionDate) {
        this.nextInspectionDate = nextInspectionDate == null ? null : nextInspectionDate.trim();
    }

    public String getLastOverhaulDate() {
        return lastOverhaulDate;
    }

    public void setLastOverhaulDate(String lastOverhaulDate) {
        this.lastOverhaulDate = lastOverhaulDate == null ? null : lastOverhaulDate.trim();
    }

    public String getOverhaulMan() {
        return overhaulMan;
    }

    public void setOverhaulMan(String overhaulMan) {
        this.overhaulMan = overhaulMan == null ? null : overhaulMan.trim();
    }

    public String getTechnicalParameter() {
        return technicalParameter;
    }

    public void setTechnicalParameter(String technicalParameter) {
        this.technicalParameter = technicalParameter == null ? null : technicalParameter.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getManufacturerContactAddress() {
        return manufacturerContactAddress;
    }

    public void setManufacturerContactAddress(String manufacturerContactAddress) {
        this.manufacturerContactAddress = manufacturerContactAddress == null ? null : manufacturerContactAddress.trim();
    }

    public String getManufacturerContact() {
        return manufacturerContact;
    }

    public void setManufacturerContact(String manufacturerContact) {
        this.manufacturerContact = manufacturerContact == null ? null : manufacturerContact.trim();
    }

    public String getManufacturerPhoneOne() {
        return manufacturerPhoneOne;
    }

    public void setManufacturerPhoneOne(String manufacturerPhoneOne) {
        this.manufacturerPhoneOne = manufacturerPhoneOne == null ? null : manufacturerPhoneOne.trim();
    }

    public String getManufacturerPhoneTwo() {
        return manufacturerPhoneTwo;
    }

    public void setManufacturerPhoneTwo(String manufacturerPhoneTwo) {
        this.manufacturerPhoneTwo = manufacturerPhoneTwo == null ? null : manufacturerPhoneTwo.trim();
    }

    public String getInstallDate() {
        return installDate;
    }

    public void setInstallDate(String installDate) {
        this.installDate = installDate == null ? null : installDate.trim();
    }

    public String getSafetyOfficer() {
        return safetyOfficer;
    }

    public void setSafetyOfficer(String safetyOfficer) {
        this.safetyOfficer = safetyOfficer == null ? null : safetyOfficer.trim();
    }

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate == null ? null : useDate.trim();
    }

    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue == null ? null : assetValue.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }
}