package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.R;
import interaction.formularize;
import interaction.saneness;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3103nf extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3103nf(Context context, dern dernVar) {
        super(2, dernVar);
        this.a = context;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3103nf(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3103nf(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3153pf c3153pf = C3153pf.a;
        Context context = this.a;
        C3227sf c3227sf = C3153pf.c;
        if (c3227sf == null) {
            c3227sf = new C3227sf(context);
            C3153pf.c = c3227sf;
        }
        String strA = c3227sf.a.a("omid_js_string");
        if (strA != null) {
            return strA;
        }
        Context context2 = this.a;
        int i = R.raw.inmobi_omid_js;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        try {
            InputStream inputStreamOpenRawResource = context2.getResources().openRawResource(i);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strImpromptu = formularize.impromptu(bufferedReader);
                saneness.attabal(bufferedReader, null);
                return strImpromptu;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    saneness.attabal(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }
}
