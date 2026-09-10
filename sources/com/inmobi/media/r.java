package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3333z5 f23942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC3333z5 interfaceC3333z5, Context context, long j) {
        super(0);
        this.f23942a = interfaceC3333z5;
        this.f23943b = context;
        this.f23944c = j;
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Unit invoke() {
        boolean zCompareAndSet = C3215s.d.compareAndSet(false, true);
        Unit unit = Unit.f43263a;
        if (zCompareAndSet) {
            ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).execute(new A.t0(this.f23942a, this.f23943b, this.f23944c, 0));
            return unit;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23942a;
        if (interfaceC3333z5 == null) {
            return null;
        }
        ((A5) interfaceC3333z5).c("AdAudioTracker", "Audio volume tracking is already started");
        return unit;
    }

    public static final void a(InterfaceC3333z5 interfaceC3333z5, Context context, long j) {
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (C3215s.f23973b == null) {
            Object systemService = context.getSystemService("audio");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            C3215s.f23973b = (AudioManager) systemService;
        }
        C3215s c3215s = C3215s.f23972a;
        C3215s.a(j);
        C3184q c3184q = new C3184q(j);
        C3215s.f23976h = c3184q;
        Uc.f().a(new int[]{102, 101}, c3184q);
        C3215s.f23974c = new C3136n();
        context.registerReceiver(C3215s.f23974c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        C3215s.a(Float.valueOf(c3215s.a()));
    }
}
