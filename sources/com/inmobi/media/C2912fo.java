package com.inmobi.media;

import java.nio.charset.Charset;
import kotlinx.coroutines.walach;
import okio.ByteString;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.text.Charsets;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2912fo extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC3072m9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2912fo(String str, InterfaceC3072m9 interfaceC3072m9, dern dernVar) {
        super(2, dernVar);
        this.b = str;
        this.c = interfaceC3072m9;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2912fo(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2912fo(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2809bo c2809bo;
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            jo joVar = jo.a;
            walach walachVarA = jo.a(this.b, this.c);
            this.a = 1;
            obj = walachVarA.dent(this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        Ne ne = (Ne) obj;
        jo joVar2 = jo.a;
        if (ne != null && AbstractC2935gl.a(ne)) {
            ByteString byteStringD = ne.d();
            Charset charset = Charsets.UTF_8;
            if (byteStringD.string(charset).length() > 0 && (c2809bo = jo.c) != null) {
                String str = this.b;
                IntRange intRange = Se.a;
                Intrinsics.checkNotNullParameter(ne, "<this>");
                String strString = ne.d().string(charset);
                InterfaceC3072m9 interfaceC3072m9 = this.c;
                String str2 = this.b;
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).c("WebResourceHandler", "downloadResourceAndSaveToCache() response received: " + str2);
                }
                Unit unit = Unit.f29295attabal;
                igo.attabal.attabal(c2809bo.a(str, strString, this.c));
            }
        }
        return ne;
    }
}
