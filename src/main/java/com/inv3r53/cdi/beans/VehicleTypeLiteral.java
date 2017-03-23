package com.inv3r53.cdi.beans;

import javax.enterprise.util.AnnotationLiteral;

/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

public class VehicleTypeLiteral extends AnnotationLiteral<VehicleType> implements VehicleType {

    private static final long serialVersionUID = 4137986347126623600L;

    private String vehicle;

    public VehicleTypeLiteral(final String vehicle) {
        this.vehicle = vehicle;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.inv3r53.cdi.beans.qualifier.VehicleType#type()
     */
    public String type() {
        return vehicle;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((vehicle == null) ? 0 : vehicle.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        VehicleTypeLiteral other = (VehicleTypeLiteral) obj;
        if (vehicle == null) {
            if (other.vehicle != null) {
                return false;
            }
        } else if (!vehicle.equals(other.vehicle)) {
            return false;
        }
        return true;
    }

}
