package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.sql.SqlTypesSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class GsonBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Excluder f21196a = Excluder.Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LongSerializationPolicy f21197b = LongSerializationPolicy.X;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FieldNamingStrategy f21198c = FieldNamingPolicy.X;
    public final HashMap d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f21199e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final int g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21200h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21201i = true;
    public final boolean j = true;
    public final ToNumberStrategy k = ToNumberPolicy.X;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ToNumberStrategy f21202l = ToNumberPolicy.f21205Y;
    public final LinkedList m = new LinkedList();

    public final Gson a() {
        int i2;
        TypeAdapterFactory typeAdapterFactoryA;
        TypeAdapterFactory typeAdapterFactoryA2;
        ArrayList arrayList = this.f21199e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z2 = SqlTypesSupport.f21322a;
        DefaultDateTypeAdapter.DateType dateType = DefaultDateTypeAdapter.DateType.f21254b;
        int i3 = this.g;
        if (i3 != 2 && (i2 = this.f21200h) != 2) {
            TypeAdapterFactory typeAdapterFactoryA3 = dateType.a(i3, i2);
            if (z2) {
                typeAdapterFactoryA = SqlTypesSupport.f21324c.a(i3, i2);
                typeAdapterFactoryA2 = SqlTypesSupport.f21323b.a(i3, i2);
            } else {
                typeAdapterFactoryA = null;
                typeAdapterFactoryA2 = null;
            }
            arrayList3.add(typeAdapterFactoryA3);
            if (z2) {
                arrayList3.add(typeAdapterFactoryA);
                arrayList3.add(typeAdapterFactoryA2);
            }
        }
        return new Gson(this.f21196a, (FieldNamingPolicy) this.f21198c, new HashMap(this.d), this.f21201i, this.j, this.f21197b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, (ToNumberPolicy) this.k, (ToNumberPolicy) this.f21202l, new ArrayList(this.m));
    }
}
