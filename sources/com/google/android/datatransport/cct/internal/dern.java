package com.google.android.datatransport.cct.internal;

import escorial.impassible;

/* JADX INFO: compiled from: AutoValue_ComplianceData.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern extends ComplianceData {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impassible f19287attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ComplianceData.ProductIdOrigin f19288saneness;

    /* JADX INFO: compiled from: AutoValue_ComplianceData.java */
    public static final class saneness extends ComplianceData.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public impassible f19289attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ComplianceData.ProductIdOrigin f19290saneness;

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.attabal
        public ComplianceData attabal() {
            return new dern(this.f19289attabal, this.f19290saneness);
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.attabal
        public ComplianceData.attabal dern(ComplianceData.ProductIdOrigin productIdOrigin) {
            this.f19290saneness = productIdOrigin;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.attabal
        public ComplianceData.attabal saneness(impassible impassibleVar) {
            this.f19289attabal = impassibleVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public ComplianceData.ProductIdOrigin dern() {
        return this.f19288saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComplianceData) {
            ComplianceData complianceData = (ComplianceData) obj;
            impassible impassibleVar = this.f19287attabal;
            if (impassibleVar != null ? impassibleVar.equals(complianceData.saneness()) : complianceData.saneness() == null) {
                ComplianceData.ProductIdOrigin productIdOrigin = this.f19288saneness;
                if (productIdOrigin != null ? productIdOrigin.equals(complianceData.dern()) : complianceData.dern() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        impassible impassibleVar = this.f19287attabal;
        int iHashCode = ((impassibleVar == null ? 0 : impassibleVar.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.f19288saneness;
        return iHashCode ^ (productIdOrigin != null ? productIdOrigin.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public impassible saneness() {
        return this.f19287attabal;
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f19287attabal + ", productIdOrigin=" + this.f19288saneness + "}";
    }

    public dern(impassible impassibleVar, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.f19287attabal = impassibleVar;
        this.f19288saneness = productIdOrigin;
    }
}
