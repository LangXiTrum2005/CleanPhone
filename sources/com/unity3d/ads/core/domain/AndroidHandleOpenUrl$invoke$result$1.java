package com.unity3d.ads.core.domain;

import ak.f;
import android.content.Intent;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import fn.m0;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1", f = "AndroidHandleOpenUrl.kt", l = {}, m = "invokeSuspend")
public final class AndroidHandleOpenUrl$invoke$result$1 extends i implements c {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $useActivityForResult;
    int label;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1", f = "AndroidHandleOpenUrl.kt", l = {42}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ boolean $useActivityForResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, Intent intent, boolean z10, f fVar) {
            super(2, fVar);
            this.$adObject = adObject;
            this.$intent = intent;
            this.$useActivityForResult = z10;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                m0 displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                String string = ProtobufExtensionsKt.toUUID(this.$adObject.getOpportunityId()).toString();
                n.e(string, "adObject.opportunityId.toUUID().toString()");
                DisplayMessage.OpenUrl openUrl = new DisplayMessage.OpenUrl(string, this.$intent, this.$useActivityForResult);
                this.label = 1;
                Object objEmit = displayMessages.emit(openUrl, this);
                bk.a aVar = bk.a.f5708a;
                if (objEmit == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleOpenUrl$invoke$result$1(AdObject adObject, Intent intent, boolean z10, f fVar) {
        super(2, fVar);
        this.$adObject = adObject;
        this.$intent = intent;
        this.$useActivityForResult = z10;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidHandleOpenUrl$invoke$result$1(this.$adObject, this.$intent, this.$useActivityForResult, fVar);
    }

    @Override // jk.c
    public final Object invoke(fn.f fVar, f fVar2) {
        return ((AndroidHandleOpenUrl$invoke$result$1) create(fVar, fVar2)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        d0.w(d0.b(getContext()), null, new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, null), 3);
        return r.f53297a;
    }
}
