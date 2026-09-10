package com.inmobi.media;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3094k5 extends ObservableProperty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3110l5 f23746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3094k5(EnumC3179pa enumC3179pa, C3110l5 c3110l5) {
        super(enumC3179pa);
        this.f23746a = c3110l5;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.f(property, "property");
        EnumC3179pa enumC3179pa = (EnumC3179pa) obj2;
        if (AbstractC3195qa.a((EnumC3179pa) obj) == AbstractC3195qa.a(enumC3179pa)) {
            return;
        }
        Iterator it = this.f23746a.f23766b.iterator();
        while (it.hasNext()) {
            ((InterfaceC3226sa) it.next()).a(enumC3179pa);
        }
    }
}
