/*
 * #%L
 * BroadleafCommerce Framework Web
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.core.web.api.wrapper;

import org.broadleafcommerce.common.money.Money;
import org.broadleafcommerce.core.catalog.domain.SkuBundleItem;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "skuBundleItem")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class SkuBundleItemWrapper extends BaseWrapper implements APIWrapper<SkuBundleItem> {
    
    @XmlElement
    protected Long id;
    
    @XmlElement
    protected Integer quantity;
    
    @XmlElement
    protected Money salePrice;
    
    @XmlElement
    protected Money retailPrice;
    
    @XmlElement
    protected Long bundleId;
    
    @XmlElement
    protected SkuWrapper sku;
    
    @XmlElement
    protected String name;

    @XmlElement
    protected Boolean active;

    @XmlElement
    protected String description;

    @XmlElement
    protected String longDescription;
    @XmlElement
    private Long productId;

    @Override
    public void wrapDetails(SkuBundleItem model, HttpServletRequest request) {
        this.id = model.getId();
        this.quantity = model.getQuantity();
        this.salePrice = model.getSalePrice();
        this.retailPrice = model.getRetailPrice();
        this.bundleId = model.getBundle().getId();
        this.name = model.getSku().getName();
        this.description = model.getSku().getDescription();
        this.longDescription = model.getSku().getLongDescription();
        this.active = model.getSku().isActive();
        // this.sku = (SkuWrapper)context.getBean(SkuWrapper.class.getName());
        // this.sku.wrap(model.getSku(), request);
        this.productId = model.getSku().getProduct().getId();
    }

    @Override
    public void wrapSummary(SkuBundleItem model, HttpServletRequest request) {
        wrapDetails(model, request);
    }

    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    /**
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
    /**
     * @return the salePrice
     */
    public Money getSalePrice() {
        return salePrice;
    }

    
    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(Money salePrice) {
        this.salePrice = salePrice;
    }

    
    /**
     * @return the retailPrice
     */
    public Money getRetailPrice() {
        return retailPrice;
    }

    
    /**
     * @param retailPrice the retailPrice to set
     */
    public void setRetailPrice(Money retailPrice) {
        this.retailPrice = retailPrice;
    }

    
    /**
     * @return the bundleId
     */
    public Long getBundleId() {
        return bundleId;
    }

    
    /**
     * @param bundleId the bundleId to set
     */
    public void setBundleId(Long bundleId) {
        this.bundleId = bundleId;
    }

    
    /**
     * @return the sku
     */
    public SkuWrapper getSku() {
        return sku;
    }

    
    /**
     * @param sku the sku to set
     */
    public void setSku(SkuWrapper sku) {
        this.sku = sku;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /**
     * @return the active
     */
    public Boolean getActive() {
        return active;
    }

    
    /**
     * @param active the active to set
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    /**
     * @return the longDescription
     */
    public String getLongDescription() {
        return longDescription;
    }

    
    /**
     * @param longDescription the longDescription to set
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    
    /**
     * @return the productId
     */
    public Long getProductId() {
        return productId;
    }

    
    /**
     * @param productId the productId to set
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
