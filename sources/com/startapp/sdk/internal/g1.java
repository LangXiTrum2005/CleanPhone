package com.startapp.sdk.internal;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes6.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40992a;

    public g1(Context context, AttributeSet attributeSet) {
        String string = null;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "adTag", -1);
            string = attributeResourceValue != -1 ? context.getResources().getString(attributeResourceValue) : attributeSet.getAttributeValue(null, "adTag");
        } catch (Exception unused) {
        }
        this.f40992a = string;
    }
}
