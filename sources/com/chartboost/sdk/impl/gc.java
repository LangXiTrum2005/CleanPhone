package com.chartboost.sdk.impl;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum gc {
    OPEN(MRAIDPresenter.OPEN),
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    UNLOAD("unload");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14013b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f14012h = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14010c = new a(null);

    public static final class a {
        public a() {
        }

        public final gc a(String stringValue) {
            Intrinsics.f(stringValue, "stringValue");
            gc gcVar = gc.OPEN;
            if (stringValue.equals(gcVar.b())) {
                return gcVar;
            }
            gc gcVar2 = gc.SET_ORIENTATION_PROPERTIES;
            if (stringValue.equals(gcVar2.b())) {
                return gcVar2;
            }
            gc gcVar3 = gc.UNLOAD;
            if (stringValue.equals(gcVar3.b())) {
                return gcVar3;
            }
            throw new IllegalArgumentException("Not a valid MraidJSToNativeCommand.");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    gc(String str) {
        this.f14013b = str;
    }

    public final String b() {
        return this.f14013b;
    }
}
