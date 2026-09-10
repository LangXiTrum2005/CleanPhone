package com.google.gson.internal.sql;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes4.dex */
public final class SqlTypesSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f21322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.DateType f21323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.DateType f21324c;
    public static final TypeAdapterFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeAdapterFactory f21325e;
    public static final TypeAdapterFactory f;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.SqlTypesSupport$1, reason: invalid class name */
    public class AnonymousClass1 extends DefaultDateTypeAdapter.DateType<Date> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
        public final java.util.Date b(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.sql.SqlTypesSupport$2, reason: invalid class name */
    public class AnonymousClass2 extends DefaultDateTypeAdapter.DateType<Timestamp> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
        public final java.util.Date b(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        f21322a = z2;
        if (z2) {
            f21323b = new AnonymousClass1(Date.class);
            f21324c = new AnonymousClass2(Timestamp.class);
            d = SqlDateTypeAdapter.f21316b;
            f21325e = SqlTimeTypeAdapter.f21318b;
            f = SqlTimestampTypeAdapter.f21320b;
            return;
        }
        f21323b = null;
        f21324c = null;
        d = null;
        f21325e = null;
        f = null;
    }
}
