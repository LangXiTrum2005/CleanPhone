package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.chartboost.adsession.media.InteractionType;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import com.iab.omid.library.chartboost.adsession.media.Position;
import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd.a f14420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14422c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14423e;
    public boolean f;
    public boolean g;

    public ld(kd.a sessionHolder, boolean z2) {
        Intrinsics.f(sessionHolder, "sessionHolder");
        this.f14420a = sessionHolder;
        this.f14421b = z2;
    }

    public final MediaEvents a(String str) {
        if (this.f14420a.a() == null) {
            za.a("MediaEvents are null when executing " + str, (Throwable) null, 2, (Object) null);
        } else {
            za.a("MediaEvents valid when executing: " + str, (Throwable) null, 2, (Object) null);
        }
        return this.f14420a.a();
    }

    public final void b() {
        try {
            MediaEvents mediaEventsA = a("signalMediaBufferFinish");
            if (mediaEventsA != null) {
                mediaEventsA.bufferFinish();
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void c() {
        try {
            MediaEvents mediaEventsA = a("signalMediaBufferStart");
            if (mediaEventsA != null) {
                mediaEventsA.bufferStart();
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void d() {
        try {
            MediaEvents mediaEventsA = a("signalMediaComplete");
            if (mediaEventsA != null) {
                mediaEventsA.complete();
            }
            this.f = true;
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void e() {
        try {
            if (this.f14422c) {
                return;
            }
            za.a("Signal media first quartile", (Throwable) null, 2, (Object) null);
            MediaEvents mediaEventsA = a("signalMediaFirstQuartile");
            if (mediaEventsA != null) {
                mediaEventsA.firstQuartile();
            }
            this.f14422c = true;
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void f() {
        try {
            if (this.d) {
                return;
            }
            za.a("Signal media midpoint", (Throwable) null, 2, (Object) null);
            MediaEvents mediaEventsA = a("signalMediaMidpoint");
            if (mediaEventsA != null) {
                mediaEventsA.midpoint();
            }
            this.d = true;
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void g() {
        try {
            MediaEvents mediaEventsA = a("signalMediaPause");
            if (mediaEventsA != null) {
                mediaEventsA.pause();
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void h() {
        try {
            MediaEvents mediaEventsA = a("signalMediaResume");
            if (mediaEventsA != null) {
                mediaEventsA.resume();
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void i() {
        try {
            if (this.g || this.f) {
                return;
            }
            za.a("Signal media skipped", (Throwable) null, 2, (Object) null);
            MediaEvents mediaEventsA = a("signalMediaSkipped");
            if (mediaEventsA != null) {
                mediaEventsA.skipped();
            }
            this.g = true;
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void j() {
        try {
            if (this.f14423e) {
                return;
            }
            za.a("Signal media third quartile", (Throwable) null, 2, (Object) null);
            MediaEvents mediaEventsA = a("signalMediaThirdQuartile");
            if (mediaEventsA != null) {
                mediaEventsA.thirdQuartile();
            }
            this.f14423e = true;
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void k() {
        try {
            MediaEvents mediaEventsA = a("signalUserInteractionClick");
            if (mediaEventsA != null) {
                mediaEventsA.adUserInteraction(InteractionType.CLICK);
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void l() {
        Unit unit;
        if (!this.f14421b) {
            za.b("OMSDK start session OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdSession adSessionC = this.f14420a.c();
            if (adSessionC != null) {
                adSessionC.start();
                za.a("Omid session started successfully! Version: " + Omid.getVersion(), (Throwable) null, 2, (Object) null);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Omid start session is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        if (!this.f14421b) {
            za.b("OMSDK stop session OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            try {
                AdSession adSessionC = this.f14420a.c();
                if (adSessionC != null) {
                    adSessionC.finish();
                    adSessionC.registerAdView(null);
                }
                Omid.updateLastActivity();
                za.a("Omid session finished!", (Throwable) null, 2, (Object) null);
            } catch (Exception e2) {
                za.b("OMSDK stop session exception", e2);
            }
        } finally {
            this.f14420a.a((AdSession) null);
            this.f14420a.a((AdEvents) null);
        }
    }

    public final void a(View obstructionView) {
        Intrinsics.f(obstructionView, "obstructionView");
        AdSession adSessionC = this.f14420a.c();
        if (adSessionC != null) {
            adSessionC.addFriendlyObstruction(obstructionView, FriendlyObstructionPurpose.OTHER, "Industry Icon");
        }
    }

    public final void a() {
        Unit unit;
        if (!this.f14421b) {
            za.b("OMSDK signal impression event OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdEvents adEventsB = this.f14420a.b();
            if (adEventsB != null) {
                adEventsB.impressionOccurred();
                za.a("Signal om ad event impression occurred!", (Throwable) null, 2, (Object) null);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Omid signal impression event is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void a(Integer num) {
        Unit unit;
        VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia;
        if (!this.f14421b) {
            za.b("OMSDK signal load OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdEvents adEventsB = this.f14420a.b();
            if (adEventsB != null) {
                boolean z2 = num != null && num.intValue() > 0;
                if (z2) {
                    if (z2) {
                        vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(num != null ? num.intValue() : 0.0f, true, Position.STANDALONE);
                    } else {
                        vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    adEventsB.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                } else {
                    adEventsB.loaded();
                }
                za.a("Signal om ad event loaded!", (Throwable) null, 2, (Object) null);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Omid load event is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void a(float f, float f2) {
        this.f14422c = false;
        this.d = false;
        this.f14423e = false;
        try {
            MediaEvents mediaEventsA = a("signalMediaStart duration: " + f + " and volume " + f2);
            if (mediaEventsA != null) {
                mediaEventsA.start(f, f2);
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void a(PlayerState playerState) {
        Intrinsics.f(playerState, "playerState");
        try {
            MediaEvents mediaEventsA = a("signalMediaStateChange state: " + playerState.name());
            if (mediaEventsA != null) {
                mediaEventsA.playerStateChange(playerState);
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }

    public final void a(float f) {
        try {
            MediaEvents mediaEventsA = a("signalMediaVolumeChange volume: " + f);
            if (mediaEventsA != null) {
                mediaEventsA.volumeChange(f);
            }
        } catch (Exception e2) {
            za.b("Error", e2);
        }
    }
}
