package com.startapp.sdk.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dc extends k6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(Context context) {
        super(context);
        Intrinsics.f(context, "context");
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object a() {
        Locale locale;
        Configuration configuration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Resources resources = this.f41177a.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            locale = null;
        } else {
            locale = configuration.locale;
            LocaleList locales = configuration.getLocales();
            Intrinsics.e(locales, "getLocales(...)");
            if (locales.size() > 0) {
                int size = locales.size();
                boolean z2 = true;
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale2 = locales.get(i2);
                    if (locale2 != null) {
                        if (linkedHashSet.size() < 11) {
                            linkedHashSet.add(locale2);
                        }
                        if (z2) {
                            z2 = false;
                            locale = locale2;
                        }
                    }
                }
            }
        }
        Locale locale3 = Locale.getDefault(Locale.Category.DISPLAY);
        if (locale == null) {
            locale = locale3;
        }
        if (linkedHashSet.size() < 11) {
            Intrinsics.c(locale3);
            linkedHashSet.add(locale3);
        }
        Locale locale4 = Locale.getDefault();
        if (locale4 != null) {
            if (locale == null) {
                locale = locale4;
            }
            if (linkedHashSet.size() < 11) {
                linkedHashSet.add(locale4);
            }
        }
        if (locale == null) {
            locale = new Locale(com.smartdigimkt.d2.a.Z);
        }
        linkedHashSet.remove(locale);
        return new cc(locale, linkedHashSet);
    }

    @Override // com.startapp.sdk.internal.k6
    public final /* bridge */ /* synthetic */ Object c() {
        return cc.d;
    }
}
