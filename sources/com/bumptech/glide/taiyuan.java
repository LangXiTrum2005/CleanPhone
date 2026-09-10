package com.bumptech.glide;

import com.bumptech.glide.taiyuan;
import com.bumptech.glide.util.formularize;

/* JADX INFO: compiled from: TransitionOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class taiyuan<CHILD extends taiyuan<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public quadrennium.dern<? super TranscodeType> f17917kowloon = quadrennium.attabal.attabal();

    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final quadrennium.dern<? super TranscodeType> dern() {
        return this.f17917kowloon;
    }

    public boolean equals(Object obj) {
        if (obj instanceof taiyuan) {
            return formularize.marial(this.f17917kowloon, ((taiyuan) obj).f17917kowloon);
        }
        return false;
    }

    public int hashCode() {
        quadrennium.dern<? super TranscodeType> dernVar = this.f17917kowloon;
        if (dernVar != null) {
            return dernVar.hashCode();
        }
        return 0;
    }
}
