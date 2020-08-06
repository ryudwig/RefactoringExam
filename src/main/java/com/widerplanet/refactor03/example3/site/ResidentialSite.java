package com.widerplanet.refactor03.example3.site;


public class ResidentialSite extends Site{
    protected double calculateTaxAmount() {
        return calculateBaseAmount() * Site.TAX_RATE;
    }

    protected double calculateBaseAmount() {
        return getRate() * getUnits();
    }



}