package com.codejoy.boom.clap.helper;

import android.media.AudioManager;
import com.codejoy.boom.clap.BoomClapApplication;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudioVolumeUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/codejoy/boom/clap/helper/saneness;", "", "<init>", "()V", "", "volume", "", "attabal", "(I)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f18266attabal = new saneness();

    public final void attabal(int volume) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = BoomClapApplication.INSTANCE.attabal().getSystemService("audio");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            ((AudioManager) systemService).setStreamVolume(3, volume, 0);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }
}
