package com.ironsource;

import android.os.OutcomeReceiver;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3783v1 {

    /* JADX INFO: renamed from: com.ironsource.v1$a */
    public static final class a implements OutcomeReceiver {
        final /* synthetic */ wretchedly.dern<Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wretchedly.dern<? super Unit> dernVar) {
            this.a = dernVar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            wretchedly.dern<Unit> dernVar = this.a;
            Result.Companion companion = Result.INSTANCE;
            dernVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(error)));
        }

        public void onResult(Object obj) {
            wretchedly.dern<Unit> dernVar = this.a;
            Result.Companion companion = Result.INSTANCE;
            dernVar.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
    }

    public static final OutcomeReceiver a(wretchedly.dern<? super Unit> dernVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        return new a(dernVar);
    }
}
