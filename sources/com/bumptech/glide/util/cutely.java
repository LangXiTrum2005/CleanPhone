package com.bumptech.glide.util;

/* JADX INFO: compiled from: MultiClassKey.java */
/* JADX INFO: loaded from: classes2.dex */
public class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Class<?> f17927attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Class<?> f17928dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Class<?> f17929saneness;

    public cutely() {
    }

    public void attabal(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f17927attabal = cls;
        this.f17929saneness = cls2;
        this.f17928dern = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cutely cutelyVar = (cutely) obj;
        return this.f17927attabal.equals(cutelyVar.f17927attabal) && this.f17929saneness.equals(cutelyVar.f17929saneness) && formularize.marial(this.f17928dern, cutelyVar.f17928dern);
    }

    public int hashCode() {
        int iHashCode = ((this.f17927attabal.hashCode() * 31) + this.f17929saneness.hashCode()) * 31;
        Class<?> cls = this.f17928dern;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f17927attabal + ", second=" + this.f17929saneness + '}';
    }

    public cutely(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        attabal(cls, cls2, cls3);
    }
}
