package com.airbnb.lottie.model;

import androidx.datastore.preferences.protobuf.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FontCharacter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f9724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f9725c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9726e;

    public FontCharacter(ArrayList arrayList, char c2, double d, String str, String str2) {
        this.f9723a = arrayList;
        this.f9724b = c2;
        this.f9725c = d;
        this.d = str;
        this.f9726e = str2;
    }

    public static int a(char c2, String str, String str2) {
        return str2.hashCode() + a.b(str, c2 * 31, 31);
    }

    public final int hashCode() {
        return a(this.f9724b, this.f9726e, this.d);
    }
}
