package com.tiktok.appevents;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class TTUserInfo implements Cloneable, Serializable {
    public final Object clone() {
        try {
            return (TTUserInfo) super.clone();
        } catch (Exception unused) {
            return new TTUserInfo();
        }
    }
}
