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
package com.inv3r53.cdi.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Bean1 {

    @PostConstruct
    private void init() {
        System.out.println("Post Construct :" + getClass());
    }

    @PreDestroy
    private void dest() {
        System.out.println("Pre Destroy :" + getClass());
    }

    @Inject
    private Bean2 bean2;

    public void run() {
        bean2.print();
    }

}
