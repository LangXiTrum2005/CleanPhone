package com.charging.screenshow.battery.animations.themes.activity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.animation.AnimationUtils;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActChargingBinding;
import com.charging.screenshow.battery.animations.themes.databinding.ActChargingPreviewBinding;
import com.charging.screenshow.battery.animations.themes.databinding.ActChargingShowBinding;
import com.charging.screenshow.battery.animations.themes.databinding.ActThreeDShowBinding;
import com.charging.screenshow.battery.animations.themes.entity.event.EventBatteryChange;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.BatteryUtils;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.startapp.sdk.internal.kb;
import com.startapp.sdk.internal.z6;
import es.dmoral.toasty.Toasty;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.internal.JsonNamesMapKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f13045Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ f(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f13045Y = obj;
        this.Z = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        Object obj = this.Z;
        Object obj2 = this.f13045Y;
        switch (this.X) {
            case 0:
                ActThreeDShowBinding actThreeDShowBinding = ((Charging3DShowAct) obj2).h0;
                if (actThreeDShowBinding != null) {
                    actThreeDShowBinding.f13163h.setText(((EventBatteryChange) obj).a());
                    return unit;
                }
                Intrinsics.m("binding");
                throw null;
            case 1:
                int i2 = ChargingVideoAct.n0;
                if (((Boolean) obj2).booleanValue()) {
                    final ChargingVideoAct chargingVideoAct = (ChargingVideoAct) obj;
                    ActChargingBinding actChargingBinding = chargingVideoAct.h0;
                    if (actChargingBinding == null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.a(actChargingBinding.f13094b);
                    ActChargingBinding actChargingBinding2 = chargingVideoAct.h0;
                    if (actChargingBinding2 == null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.b(actChargingBinding2.o);
                    ChargingVideo chargingVideo = chargingVideoAct.j0;
                    if (chargingVideo != null) {
                        ActChargingBinding actChargingBinding3 = chargingVideoAct.h0;
                        if (actChargingBinding3 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        float f = Float.parseFloat(chargingVideo.getY()) * (actChargingBinding3.f13095c.getHeight() / 2);
                        ActChargingBinding actChargingBinding4 = chargingVideoAct.h0;
                        if (actChargingBinding4 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingBinding4.j.setTranslationY(f);
                        ActChargingBinding actChargingBinding5 = chargingVideoAct.h0;
                        if (actChargingBinding5 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingBinding5.f13097h.setColorFilter(Color.parseColor(chargingVideo.getTextColor()));
                        ActChargingBinding actChargingBinding6 = chargingVideoAct.h0;
                        if (actChargingBinding6 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingBinding6.f13097h.startAnimation(AnimationUtils.loadAnimation(chargingVideoAct, R.anim.ani_scale));
                        ActChargingBinding actChargingBinding7 = chargingVideoAct.h0;
                        if (actChargingBinding7 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingBinding7.t.setTextColor(Color.parseColor(chargingVideo.getTextColor()));
                        ActChargingBinding actChargingBinding8 = chargingVideoAct.h0;
                        if (actChargingBinding8 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingBinding8.t.setText(android.support.v4.media.a.p(new StringBuilder(), (int) BatteryUtils.a(chargingVideoAct), '%'));
                    }
                    if (chargingVideoAct.t() == null) {
                        Toasty.b(chargingVideoAct, IntExt.c(R.string.video_not_downloaded)).show();
                    } else {
                        chargingVideoAct.k0 = new MediaPlayer();
                        ActChargingBinding actChargingBinding9 = chargingVideoAct.h0;
                        if (actChargingBinding9 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        ViewExt.b(actChargingBinding9.f13095c);
                        ActChargingBinding actChargingBinding10 = chargingVideoAct.h0;
                        if (actChargingBinding10 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        ViewExt.b(actChargingBinding10.f13101p);
                        ActChargingBinding actChargingBinding11 = chargingVideoAct.h0;
                        if (actChargingBinding11 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingBinding11.f13101p.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.charging.screenshow.battery.animations.themes.activity.ChargingVideoAct$playVideo$1
                            @Override // android.view.SurfaceHolder.Callback
                            public final void surfaceChanged(SurfaceHolder holder, int i3, int i4, int i5) {
                                Intrinsics.f(holder, "holder");
                            }

                            @Override // android.view.SurfaceHolder.Callback
                            public final void surfaceCreated(SurfaceHolder holder) {
                                ChargingVideoAct chargingVideoAct2 = chargingVideoAct;
                                Intrinsics.f(holder, "holder");
                                try {
                                    MediaPlayer mediaPlayer = chargingVideoAct2.k0;
                                    if (mediaPlayer != null) {
                                        mediaPlayer.reset();
                                    }
                                    MediaPlayer mediaPlayer2 = chargingVideoAct2.k0;
                                    if (mediaPlayer2 != null) {
                                        Uri uriT = chargingVideoAct2.t();
                                        Intrinsics.c(uriT);
                                        mediaPlayer2.setDataSource(chargingVideoAct2, uriT);
                                    }
                                    MediaPlayer mediaPlayer3 = chargingVideoAct2.k0;
                                    if (mediaPlayer3 != null) {
                                        mediaPlayer3.setVideoScalingMode(2);
                                    }
                                    MediaPlayer mediaPlayer4 = chargingVideoAct2.k0;
                                    if (mediaPlayer4 != null) {
                                        mediaPlayer4.setDisplay(holder);
                                    }
                                    MediaPlayer mediaPlayer5 = chargingVideoAct2.k0;
                                    if (mediaPlayer5 != null) {
                                        mediaPlayer5.setLooping(true);
                                    }
                                    MediaPlayer mediaPlayer6 = chargingVideoAct2.k0;
                                    if (mediaPlayer6 != null) {
                                        mediaPlayer6.setVolume(0.0f, 0.0f);
                                    }
                                    MediaPlayer mediaPlayer7 = chargingVideoAct2.k0;
                                    if (mediaPlayer7 != null) {
                                        mediaPlayer7.prepare();
                                    }
                                    MediaPlayer mediaPlayer8 = chargingVideoAct2.k0;
                                    if (mediaPlayer8 != null) {
                                        mediaPlayer8.start();
                                    }
                                } catch (Exception unused) {
                                }
                            }

                            @Override // android.view.SurfaceHolder.Callback
                            public final void surfaceDestroyed(SurfaceHolder holder) {
                                Intrinsics.f(holder, "holder");
                            }
                        });
                    }
                }
                return unit;
            case 2:
                ActChargingBinding actChargingBinding12 = ((ChargingVideoAct) obj2).h0;
                if (actChargingBinding12 != null) {
                    actChargingBinding12.f13100n.setProgress(((Float) obj).floatValue());
                    return unit;
                }
                Intrinsics.m("binding");
                throw null;
            case 3:
                ActChargingPreviewBinding actChargingPreviewBinding = ((ChargingVideoPreviewAct) obj2).h0;
                if (actChargingPreviewBinding != null) {
                    actChargingPreviewBinding.g.setProgress(((Float) obj).floatValue());
                    return unit;
                }
                Intrinsics.m("binding");
                throw null;
            case 4:
                int i3 = ChargingVideoPreviewAct.o0;
                if (((Boolean) obj2).booleanValue()) {
                    final ChargingVideoPreviewAct chargingVideoPreviewAct = (ChargingVideoPreviewAct) obj;
                    ActChargingPreviewBinding actChargingPreviewBinding2 = chargingVideoPreviewAct.h0;
                    if (actChargingPreviewBinding2 == null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.a(actChargingPreviewBinding2.f13108c);
                    ChargingVideo chargingVideo2 = chargingVideoPreviewAct.j0;
                    if (chargingVideo2 != null) {
                        ActChargingPreviewBinding actChargingPreviewBinding3 = chargingVideoPreviewAct.h0;
                        if (actChargingPreviewBinding3 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        float f2 = Float.parseFloat(chargingVideo2.getY()) * (actChargingPreviewBinding3.f13107b.getHeight() / 2);
                        ActChargingPreviewBinding actChargingPreviewBinding4 = chargingVideoPreviewAct.h0;
                        if (actChargingPreviewBinding4 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingPreviewBinding4.f.setTranslationY(f2);
                        ActChargingPreviewBinding actChargingPreviewBinding5 = chargingVideoPreviewAct.h0;
                        if (actChargingPreviewBinding5 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingPreviewBinding5.f13109e.setColorFilter(Color.parseColor(chargingVideo2.getTextColor()));
                        ActChargingPreviewBinding actChargingPreviewBinding6 = chargingVideoPreviewAct.h0;
                        if (actChargingPreviewBinding6 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingPreviewBinding6.f13109e.startAnimation(AnimationUtils.loadAnimation(chargingVideoPreviewAct, R.anim.ani_scale));
                        ActChargingPreviewBinding actChargingPreviewBinding7 = chargingVideoPreviewAct.h0;
                        if (actChargingPreviewBinding7 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingPreviewBinding7.f13111i.setTextColor(Color.parseColor(chargingVideo2.getTextColor()));
                        ActChargingPreviewBinding actChargingPreviewBinding8 = chargingVideoPreviewAct.h0;
                        if (actChargingPreviewBinding8 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingPreviewBinding8.f13111i.setText(android.support.v4.media.a.p(new StringBuilder(), (int) BatteryUtils.a(chargingVideoPreviewAct), '%'));
                    }
                    if (chargingVideoPreviewAct.s() == null) {
                        Toasty.b(chargingVideoPreviewAct, IntExt.c(R.string.video_not_downloaded)).show();
                    } else {
                        chargingVideoPreviewAct.k0 = new MediaPlayer();
                        ActChargingPreviewBinding actChargingPreviewBinding9 = chargingVideoPreviewAct.h0;
                        if (actChargingPreviewBinding9 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        ViewExt.b(actChargingPreviewBinding9.f13110h);
                        ActChargingPreviewBinding actChargingPreviewBinding10 = chargingVideoPreviewAct.h0;
                        if (actChargingPreviewBinding10 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingPreviewBinding10.f13110h.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.charging.screenshow.battery.animations.themes.activity.ChargingVideoPreviewAct$playVideo$1
                            @Override // android.view.SurfaceHolder.Callback
                            public final void surfaceChanged(SurfaceHolder holder, int i4, int i5, int i6) {
                                Intrinsics.f(holder, "holder");
                            }

                            @Override // android.view.SurfaceHolder.Callback
                            public final void surfaceCreated(SurfaceHolder holder) {
                                ChargingVideoPreviewAct chargingVideoPreviewAct2 = chargingVideoPreviewAct;
                                Intrinsics.f(holder, "holder");
                                try {
                                    MediaPlayer mediaPlayer = chargingVideoPreviewAct2.k0;
                                    if (mediaPlayer != null) {
                                        mediaPlayer.reset();
                                    }
                                    MediaPlayer mediaPlayer2 = chargingVideoPreviewAct2.k0;
                                    if (mediaPlayer2 != null) {
                                        Uri uriS = chargingVideoPreviewAct2.s();
                                        Intrinsics.c(uriS);
                                        mediaPlayer2.setDataSource(chargingVideoPreviewAct2, uriS);
                                    }
                                    MediaPlayer mediaPlayer3 = chargingVideoPreviewAct2.k0;
                                    if (mediaPlayer3 != null) {
                                        mediaPlayer3.setVideoScalingMode(2);
                                    }
                                    MediaPlayer mediaPlayer4 = chargingVideoPreviewAct2.k0;
                                    if (mediaPlayer4 != null) {
                                        mediaPlayer4.setDisplay(holder);
                                    }
                                    MediaPlayer mediaPlayer5 = chargingVideoPreviewAct2.k0;
                                    if (mediaPlayer5 != null) {
                                        mediaPlayer5.setLooping(true);
                                    }
                                    float f3 = AppPreferencesUtil.a(AppPreferencesUtil.f13313a, AppExt.a()).getBoolean("charging_play_sound", true) ? 60.0f : 0.0f;
                                    MediaPlayer mediaPlayer6 = chargingVideoPreviewAct2.k0;
                                    if (mediaPlayer6 != null) {
                                        mediaPlayer6.setVolume(f3, f3);
                                    }
                                    MediaPlayer mediaPlayer7 = chargingVideoPreviewAct2.k0;
                                    if (mediaPlayer7 != null) {
                                        mediaPlayer7.prepare();
                                    }
                                    MediaPlayer mediaPlayer8 = chargingVideoPreviewAct2.k0;
                                    if (mediaPlayer8 != null) {
                                        mediaPlayer8.start();
                                    }
                                } catch (Exception unused) {
                                }
                            }

                            @Override // android.view.SurfaceHolder.Callback
                            public final void surfaceDestroyed(SurfaceHolder holder) {
                                Intrinsics.f(holder, "holder");
                            }
                        });
                    }
                }
                return unit;
            case 5:
                ActChargingShowBinding actChargingShowBinding = ((ChargingVideoShowAct) obj2).h0;
                if (actChargingShowBinding != null) {
                    actChargingShowBinding.f13123h.setText(((EventBatteryChange) obj).a());
                    return unit;
                }
                Intrinsics.m("binding");
                throw null;
            case 6:
                return Boolean.valueOf(z6.a((kb) obj2, (z6) obj));
            case 7:
                return SealedClassSerializer.descriptor_delegate$lambda$3((String) obj2, (SealedClassSerializer) obj);
            case 8:
                return EnumSerializer.descriptor_delegate$lambda$0((EnumSerializer) obj2, (String) obj);
            case 9:
                return ObjectSerializer.descriptor_delegate$lambda$1((String) obj2, (ObjectSerializer) obj);
            case 10:
                return JsonNamesMapKt.buildDeserializationNamesMap((SerialDescriptor) obj2, (Json) obj);
            default:
                return JsonNamesMapKt.serializationNamesIndices$lambda$4((SerialDescriptor) obj2, (JsonNamingStrategy) obj);
        }
    }
}
