package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.channels.kowloon;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3354xh extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Bh c;
    public final /* synthetic */ String d;
    public final /* synthetic */ RootConfig e;
    public final /* synthetic */ kowloon f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3354xh(List list, Bh bh, String str, RootConfig rootConfig, kowloon kowloonVar, dern dernVar) {
        super(2, dernVar);
        this.b = list;
        this.c = bh;
        this.d = str;
        this.e = rootConfig;
        this.f = kowloonVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3354xh c3354xh = new C3354xh(this.b, this.c, this.d, this.e, this.f, dernVar);
        c3354xh.a = obj;
        return c3354xh;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3354xh) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        saran saranVar = (saran) this.a;
        List list = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((C3067m4) obj2).a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        Bh bh = this.c;
        String str2 = this.d;
        RootConfig rootConfig = this.e;
        kowloon kowloonVar = this.f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            cutely.wireman(saranVar, null, null, new C3329wh(bh, (String) entry.getKey(), str2, rootConfig, (List) entry.getValue(), kowloonVar, null), 3, null);
        }
        return Unit.f29295attabal;
    }
}
