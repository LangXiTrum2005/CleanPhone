package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;
import patroclinal.marial;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3047l9 implements Gg {
    public final String a;
    public InMobiJsonResponse b;

    public C3047l9(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.a = content;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.inmobi.media.Gg
    public final Object a(dern dernVar) {
        C3022k9 c3022k9;
        int i;
        C3047l9 c3047l9;
        if (dernVar instanceof C3022k9) {
            c3022k9 = (C3022k9) dernVar;
            int i2 = c3022k9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3022k9.d = i2 - Integer.MIN_VALUE;
            } else {
                c3022k9 = new C3022k9(this, (ContinuationImpl) dernVar);
            }
        } else {
            c3022k9 = new C3022k9(this, (ContinuationImpl) dernVar);
        }
        Object objCast = c3022k9.b;
        Object objBeachfront = attabal.beachfront();
        int i3 = c3022k9.d;
        try {
            if (i3 == 0) {
                p002kotlin.dern.saneness(objCast);
                Intrinsics.checkNotNullParameter(InMobiJsonResponse.class, "clazz");
                Intrinsics.checkNotNullParameter(InMobiJsonResponse.class, "type");
                String str = this.a;
                c3022k9.a = this;
                c3022k9.d = 1;
                JSONObject jsonObject = new JSONObject(str);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(InMobiJsonResponse.class, "type");
                objCast = InMobiJsonResponse.class.cast(AbstractC3073ma.a(jsonObject, InMobiJsonResponse.class, null, null));
                if (objCast == objBeachfront) {
                    return objBeachfront;
                }
                c3047l9 = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3047l9 = c3022k9.a;
                p002kotlin.dern.saneness(objCast);
            }
            c3047l9.b = (InMobiJsonResponse) objCast;
            return Unit.f29295attabal;
        } catch (Throwable th) {
            marial.dern(th);
            if (th instanceof JSONException) {
                i = 2309;
            } else {
                i = th instanceof ClassCastException ? 2310 : 2311;
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, igo.attabal.beachfront((short) i)))));
        }
    }

    @Override // com.inmobi.media.Gg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        Objects.toString(this.b);
        return this.b;
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (this.b == null || this.a.length() == 0) {
            throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, (short) 3))));
        }
    }
}
