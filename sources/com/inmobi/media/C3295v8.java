package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.media3.datasource.cache.dern;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C3700q2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3295v8 {
    public final HtmlVideoPlayerRequest a;
    public final C3081mi b;
    public final InterfaceC3072m9 c;
    public final saran d;
    public final saran e;
    public monroe f;
    public final AtomicBoolean g;
    public final WeakReference h;
    public boolean i;
    public final HtmlVideoPlayerConfig j;
    public final N7 k;
    public boolean l;
    public Uh m;
    public C2777ai n;
    public boolean o;
    public C3377yf p;
    public final AtomicReference q;

    public C3295v8(GestureDetectorOnGestureListenerC2829ci renderView, AdConfig.HybridNativeConfig hybridNativeConfig, HtmlVideoPlayerRequest videoRequestConfig, C2777ai c2777ai, C3081mi c3081mi, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(videoRequestConfig, "videoRequestConfig");
        this.a = videoRequestConfig;
        this.b = c3081mi;
        this.c = interfaceC3072m9;
        C3270u8 c3270u8 = new C3270u8(polder.INSTANCE, this);
        saran saranVarAttabal = privatdozent.attabal(premeiotic.saneness().plus(c3270u8));
        this.d = saranVarAttabal;
        this.e = P4.a(saranVarAttabal, c3270u8);
        this.g = new AtomicBoolean(false);
        this.h = new WeakReference(renderView.getContext());
        this.j = videoRequestConfig.getConfig();
        Context context = renderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.k = new N7(context, hybridNativeConfig, saranVarAttabal, videoRequestConfig, interfaceC3072m9);
        this.n = c2777ai;
        this.q = new AtomicReference(EnumC3220s8.INIT);
    }

    public static /* synthetic */ boolean a(C3295v8 c3295v8, EnumC3220s8[] enumC3220s8Arr, String str, String str2, EnumC3220s8 enumC3220s8, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            enumC3220s8 = null;
        }
        return c3295v8.a(enumC3220s8Arr, str, str2, enumC3220s8);
    }

    public final void b(boolean z) throws JSONException {
        if (this.g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z ? C3700q2.v : "hide");
        EnumC3220s8[] enumC3220s8Arr = {EnumC3220s8.LOADED, EnumC3220s8.PLAYING, EnumC3220s8.PAUSED, EnumC3220s8.COMPLETED, EnumC3220s8.ERROR};
        EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
        if (a(this, enumC3220s8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            N7 n7 = this.k;
            if (n7.h.get()) {
                return;
            }
            if (z) {
                n7.e();
            } else {
                n7.f();
            }
            if (Intrinsics.wireman(Looper.myLooper(), Looper.getMainLooper())) {
                n7.n.setVisibility(z ? 0 : 8);
            } else {
                cutely.wireman(n7.c, null, null, new C3369y7(null, n7, z), 3, null);
            }
        }
    }

    public final boolean a(EnumC3220s8[] enumC3220s8Arr, String str, String str2, EnumC3220s8 enumC3220s8) {
        EnumC3220s8 enumC3220s9 = (EnumC3220s8) this.q.get();
        boolean z = false;
        if (polloi.polder(enumC3220s8Arr, enumC3220s9)) {
            if (enumC3220s8 != null && !a(enumC3220s8, str, str2)) {
                z = true;
            }
            return !z;
        }
        if (str != null) {
            String str3 = String.format("Invalid state (%s) for %s. Allowed: %s", Arrays.copyOf(new Object[]{enumC3220s9, str2, polloi.lerp(enumC3220s8Arr, null, null, null, 0, null, null, 63, null)}, 3));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            a(str, str3, str2);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r5 == com.inmobi.media.EnumC3220s8.i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r5 != com.inmobi.media.EnumC3220s8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r5 != com.inmobi.media.EnumC3220s8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 != com.inmobi.media.EnumC3220s8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r5 == com.inmobi.media.EnumC3220s8.i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
    
        if (r5 != com.inmobi.media.EnumC3220s8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0073, code lost:
    
        if (r5 != com.inmobi.media.EnumC3220s8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007c, code lost:
    
        if (r5 != com.inmobi.media.EnumC3220s8.i) goto L61;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x00b1, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.inmobi.media.EnumC3220s8 r5, java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3295v8.a(com.inmobi.media.s8, java.lang.String, java.lang.String):boolean");
    }

    public final void a(String str, String str2, String str3) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("HybridVideoPlayerHandler", "Manager error (" + str + "): " + str2);
        }
        if (this.g.get()) {
            return;
        }
        EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
        if (Intrinsics.wireman(str, "unknown")) {
            return;
        }
        X7 obj = new X7(str3);
        C2777ai c2777ai = this.n;
        if (c2777ai != null) {
            EnumC3146p8 htmlVideoTemplateEvents = EnumC3146p8.VIDEO_COMMAND_ERROR;
            Intrinsics.checkNotNullParameter(obj, "obj");
            JSONObject jSONObjectA = AbstractC3073ma.a(obj, X7.class);
            Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c2777ai.a.a(htmlVideoTemplateEvents, jSONObjectA);
        }
    }

    public final void a(boolean z) throws JSONException {
        if (this.g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        EnumC3220s8[] enumC3220s8Arr = {EnumC3220s8.LOADED, EnumC3220s8.PLAYING, EnumC3220s8.PAUSED};
        EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
        if (a(this, enumC3220s8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            N7 n7 = this.k;
            if (n7.h.get()) {
                return;
            }
            if (z) {
                S7 s7 = n7.y;
                s7.a();
                s7.d.a();
            } else {
                S7 s8 = n7.y;
                P4.a(s8.a, new R7(s8, null));
            }
        }
    }

    public final void a() throws JSONException {
        ViewGroup viewGroup;
        dern dernVar;
        if (this.g.getAndSet(true)) {
            return;
        }
        EnumC3220s8 enumC3220s8 = EnumC3220s8.DESTROYED;
        EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
        a(enumC3220s8, "executeVideoPlayerActions", (String) null);
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("HybridVideoPlayerHandler", "destroy video player");
        }
        N7 n7 = this.k;
        if (!n7.h.getAndSet(true)) {
            InterfaceC3072m9 interfaceC3072m10 = n7.b;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a("HtmlMediaPlayer", "destroy called");
            }
            monroe monroeVar = n7.v;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
            }
            n7.v = null;
            n7.l.set(EnumC3228sg.STATE_DESTROYED);
            n7.g.set(false);
            P4.a(n7.k);
            n7.x.a();
            if (n7.f.get()) {
                n7.f.set(false);
                if (!Intrinsics.wireman(Looper.myLooper(), Looper.getMainLooper())) {
                    cutely.wireman(n7.c, null, null, new I7(null, n7), 3, null);
                } else {
                    n7.p.impromptu(n7.B);
                }
            }
            if (!Intrinsics.wireman(Looper.myLooper(), Looper.getMainLooper())) {
                cutely.wireman(n7.c, null, null, new H7(null, n7), 3, null);
            } else {
                n7.p.stop();
                n7.p.dern();
                n7.p.release();
                n7.z.a();
                n7.y.d.c();
            }
            K2 k2 = n7.w;
            while (true) {
                int i = k2.f.get();
                if (i <= 0) {
                    break;
                }
                int i2 = i - 1;
                if (k2.f.compareAndSet(i, i2)) {
                    if (i2 == 0) {
                        synchronized (k2.a) {
                            try {
                                if (k2.f.get() == 0) {
                                    dernVar = k2.g;
                                    k2.g = null;
                                } else {
                                    dernVar = null;
                                }
                                Unit unit = Unit.f29295attabal;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        dernVar = null;
                    }
                    if (dernVar == null) {
                        break;
                    }
                    dernVar.gintrap();
                    break;
                }
            }
            n7.n.setOnPositionChangeListener(null);
            n7.n.removeAllViews();
            WeakReference weakReference = n7.r;
            if (weakReference != null && (viewGroup = (ViewGroup) weakReference.get()) != null) {
                viewGroup.removeView(n7.n);
            }
            WeakReference weakReference2 = n7.r;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            privatdozent.wireman(n7.c, null, 1, null);
            privatdozent.wireman(n7.d, null, 1, null);
        }
        N7 n8 = this.k;
        n8.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", n8.p.getDuration());
        jSONObject.put("playbackTime", n8.p.getCurrentPosition());
        jSONObject.put("bufferTime", n8.p.getBufferedPosition());
        String durationPayload = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(durationPayload, "toString(...)");
        C3081mi c3081mi = this.b;
        if (c3081mi != null) {
            Intrinsics.checkNotNullParameter(durationPayload, "durationPayload");
            Map mapA = c3081mi.a();
            mapA.put("payload", durationPayload);
            Wj wj = Wj.a;
            Wj.b("VideoDestroyed", mapA, EnumC2779ak.SDK);
        }
        C2777ai c2777ai = this.n;
        if (c2777ai != null) {
            EnumC3146p8 htmlVideoTemplateEvents = EnumC3146p8.VIDEO_PLAYER_DESTROYED;
            Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c2777ai.a.a(htmlVideoTemplateEvents, (Object) null);
        }
        monroe monroeVar2 = this.f;
        if (monroeVar2 != null) {
            monroe.attabal.attabal(monroeVar2, null, 1, null);
        }
        this.f = null;
        this.m = null;
        this.n = null;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x029b  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    public final void a(Rl obj) throws JSONException {
        C3295v8 c3295v8;
        C3081mi c3081mi;
        C2777ai c2777ai;
        C2777ai c2777ai2;
        Uh uh;
        C2777ai c2777ai3;
        C3377yf c3377yf;
        Ae ae;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("HybridVideoPlayerHandler", "handleMediaEvent: " + obj);
        }
        boolean z = obj instanceof C3359xm;
        if (z) {
            C2777ai c2777ai4 = this.n;
            if (c2777ai4 != null) {
                EnumC3146p8 htmlVideoTemplateEvents = EnumC3146p8.VIDEO_QUARTILES_EVENT;
                Z7[] z7Arr = Z7.a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
                c2777ai4.a.a(htmlVideoTemplateEvents, "q1");
            }
        } else if (obj instanceof C2986in) {
            C2777ai c2777ai5 = this.n;
            if (c2777ai5 != null) {
                EnumC3146p8 htmlVideoTemplateEvents2 = EnumC3146p8.VIDEO_QUARTILES_EVENT;
                Z7[] z7Arr2 = Z7.a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents2, "htmlVideoTemplateEvents");
                c2777ai5.a.a(htmlVideoTemplateEvents2, "q2");
            }
        } else if (obj instanceof C3210rn) {
            C2777ai c2777ai6 = this.n;
            if (c2777ai6 != null) {
                EnumC3146p8 htmlVideoTemplateEvents3 = EnumC3146p8.VIDEO_QUARTILES_EVENT;
                Z7[] z7Arr3 = Z7.a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents3, "htmlVideoTemplateEvents");
                c2777ai6.a.a(htmlVideoTemplateEvents3, "q3");
            }
        } else if (obj instanceof C3384ym) {
            C2777ai c2777ai7 = this.n;
            if (c2777ai7 != null) {
                EnumC3146p8 htmlVideoTemplateEvents4 = EnumC3146p8.VIDEO_QUARTILES_EVENT;
                Z7[] z7Arr4 = Z7.a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents4, "htmlVideoTemplateEvents");
                c2777ai7.a.a(htmlVideoTemplateEvents4, "q4");
            }
        } else {
            if (obj instanceof Pl) {
                if (a(EnumC3220s8.COMPLETED, (String) null, (String) null) && (c2777ai3 = this.n) != null) {
                    EnumC3146p8 htmlVideoTemplateEvents5 = EnumC3146p8.VIDEO_COMPLETE;
                    Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents5, "htmlVideoTemplateEvents");
                    c2777ai3.a.a(htmlVideoTemplateEvents5, (Object) null);
                }
            } else if (obj instanceof C2922g8) {
                c3295v8 = this;
                if (a(c3295v8, new EnumC3220s8[]{EnumC3220s8.LOADING}, null, null, EnumC3220s8.LOADED, 6)) {
                    Uh uh2 = c3295v8.m;
                    if (uh2 != null) {
                        HtmlVideoPlaybackState obj2 = ((C2922g8) obj).a;
                        Intrinsics.checkNotNullParameter(obj2, "videoInfo");
                        InterfaceC3072m9 interfaceC3072m10 = uh2.a.i;
                        if (interfaceC3072m10 != null) {
                            ((C3097n9) interfaceC3072m10).b("HtmlVideoPlayer", "onVideoLoadSuccess");
                        }
                        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = uh2.a;
                        EnumC3146p8 enumC3146p8 = EnumC3146p8.VIDEO_READY;
                        Intrinsics.checkNotNullParameter(obj2, "obj");
                        gestureDetectorOnGestureListenerC2829ci.a(enumC3146p8, AbstractC3073ma.a(obj2, HtmlVideoPlaybackState.class));
                    }
                    if (c3295v8.o) {
                        c3295v8.k.e();
                    }
                }
            } else {
                c3295v8 = this;
                if (obj instanceof C2793b8) {
                    if (a(c3295v8, new EnumC3220s8[]{EnumC3220s8.LOADING}, null, null, EnumC3220s8.LOAD_FAILED, 6) && (uh = c3295v8.m) != null) {
                        uh.a((C2793b8) obj);
                    }
                } else if (obj instanceof C2972i8) {
                    a(EnumC3220s8.ERROR, (String) null, (String) null);
                    C2777ai c2777ai8 = c3295v8.n;
                    if (c2777ai8 != null) {
                        EnumC3146p8 htmlVideoTemplateEvents6 = EnumC3146p8.VIDEO_PLAYBACK_ERROR;
                        Intrinsics.checkNotNullParameter(obj, "obj");
                        JSONObject jSONObjectA = AbstractC3073ma.a(obj, obj.getClass());
                        Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents6, "htmlVideoTemplateEvents");
                        c2777ai8.a.a(htmlVideoTemplateEvents6, jSONObjectA);
                    }
                } else if (obj instanceof Om) {
                    EnumC3220s8[] enumC3220s8Arr = {EnumC3220s8.PLAYING};
                    EnumC3220s8 enumC3220s8 = EnumC3220s8.PAUSED;
                    a(c3295v8, enumC3220s8Arr, null, null, enumC3220s8, 6);
                    if (c3295v8.q.get() == enumC3220s8 && (c2777ai2 = c3295v8.n) != null) {
                        EnumC3146p8 htmlVideoTemplateEvents7 = EnumC3146p8.VIDEO_PLAYBACK_STATE;
                        HtmlVideoPlaybackState obj3 = c3295v8.k.a();
                        Intrinsics.checkNotNullParameter(obj3, "obj");
                        JSONObject jSONObjectA2 = AbstractC3073ma.a(obj3, HtmlVideoPlaybackState.class);
                        Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents7, "htmlVideoTemplateEvents");
                        c2777ai2.a.a(htmlVideoTemplateEvents7, jSONObjectA2);
                    }
                } else if (obj instanceof C2962hn) {
                    EnumC3220s8[] enumC3220s8Arr2 = {EnumC3220s8.LOADED, EnumC3220s8.PAUSED, EnumC3220s8.COMPLETED};
                    EnumC3220s8 enumC3220s9 = EnumC3220s8.PLAYING;
                    a(c3295v8, enumC3220s8Arr2, null, null, enumC3220s9, 6);
                    if (c3295v8.q.get() == enumC3220s9 && (c2777ai = c3295v8.n) != null) {
                        EnumC3146p8 htmlVideoTemplateEvents8 = EnumC3146p8.VIDEO_PLAYBACK_STATE;
                        HtmlVideoPlaybackState obj4 = c3295v8.k.a();
                        Intrinsics.checkNotNullParameter(obj4, "obj");
                        JSONObject jSONObjectA3 = AbstractC3073ma.a(obj4, HtmlVideoPlaybackState.class);
                        Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents8, "htmlVideoTemplateEvents");
                        c2777ai.a.a(htmlVideoTemplateEvents8, jSONObjectA3);
                    }
                } else if (obj instanceof C3036kn) {
                    C2777ai c2777ai9 = c3295v8.n;
                    if (c2777ai9 != null) {
                        EnumC3146p8 htmlVideoTemplateEvents9 = EnumC3146p8.VIDEO_QUARTILES_EVENT;
                        Z7[] z7Arr5 = Z7.a;
                        Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents9, "htmlVideoTemplateEvents");
                        c2777ai9.a.a(htmlVideoTemplateEvents9, "q0");
                    }
                } else if (obj instanceof C3046l8) {
                    C3046l8 c3046l8 = (C3046l8) obj;
                    float f = c3046l8.a / 1000.0f;
                    float f2 = c3046l8.b / 1000.0f;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("time", Float.valueOf(f));
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, Float.valueOf(f2));
                    C2777ai c2777ai10 = c3295v8.n;
                    if (c2777ai10 != null) {
                        EnumC3146p8 htmlVideoTemplateEvents10 = EnumC3146p8.VIDEO_PLAYBACK_UPDATE;
                        Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents10, "htmlVideoTemplateEvents");
                        c2777ai10.a.a(htmlVideoTemplateEvents10, jSONObject);
                    }
                } else if (obj instanceof C3021k8) {
                    C2777ai c2777ai11 = c3295v8.n;
                    if (c2777ai11 != null) {
                        EnumC3146p8 htmlVideoTemplateEvents11 = EnumC3146p8.VIDEO_PLAYER_POSITION;
                        VideoViewPosition obj5 = ((C3021k8) obj).a;
                        Intrinsics.checkNotNullParameter(obj5, "obj");
                        JSONObject jSONObjectA4 = AbstractC3073ma.a(obj5, VideoViewPosition.class);
                        Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents11, "htmlVideoTemplateEvents");
                        c2777ai11.a.a(htmlVideoTemplateEvents11, jSONObjectA4);
                    }
                } else if (obj instanceof W7) {
                    C2777ai c2777ai12 = c3295v8.n;
                    if (c2777ai12 != null) {
                        EnumC3146p8 htmlVideoTemplateEvents12 = EnumC3146p8.VIDEO_CAN_PLAY_THROUGH;
                        Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents12, "htmlVideoTemplateEvents");
                        c2777ai12.a.a(htmlVideoTemplateEvents12, (Object) null);
                    }
                } else if (obj instanceof C2947h8) {
                    C2777ai c2777ai13 = c3295v8.n;
                    if (c2777ai13 != null) {
                        EnumC3146p8 htmlVideoTemplateEvents13 = EnumC3146p8.VIDEO_LOADED_METADATA;
                        Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents13, "htmlVideoTemplateEvents");
                        c2777ai13.a.a(htmlVideoTemplateEvents13, (Object) null);
                    }
                } else if (obj instanceof S1) {
                    C2777ai c2777ai14 = c3295v8.n;
                    if (c2777ai14 != null) {
                        EnumC3146p8 htmlVideoTemplateEvents14 = EnumC3146p8.VIDEO_PLAYBACK_STATE;
                        HtmlVideoPlaybackState obj6 = c3295v8.k.a();
                        Intrinsics.checkNotNullParameter(obj6, "obj");
                        JSONObject jSONObjectA5 = AbstractC3073ma.a(obj6, HtmlVideoPlaybackState.class);
                        Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents14, "htmlVideoTemplateEvents");
                        c2777ai14.a.a(htmlVideoTemplateEvents14, jSONObjectA5);
                    }
                } else if ((obj instanceof C3171q8) && (c3081mi = c3295v8.b) != null) {
                    Map mapA = c3081mi.a();
                    Wj wj = Wj.a;
                    Wj.b("ViewStateOnParentAttached", mapA, EnumC2779ak.SDK);
                }
            }
            if ((!z || (obj instanceof C2986in) || (obj instanceof C3210rn) || (obj instanceof Pl) || (obj instanceof C3036kn) || (obj instanceof Om) || (obj instanceof C2962hn) || (obj instanceof C2972i8) || (obj instanceof S1)) && (c3377yf = c3295v8.p) != null) {
                Intrinsics.checkNotNullParameter(obj, "videoEvent");
                ae = c3377yf.e;
                if (ae != null) {
                    ae.a(obj);
                }
            }
            return;
        }
        c3295v8 = this;
        if (z) {
        }
        Intrinsics.checkNotNullParameter(obj, "videoEvent");
        ae = c3377yf.e;
        if (ae != null) {
            ae.a(obj);
        }
    }
}
