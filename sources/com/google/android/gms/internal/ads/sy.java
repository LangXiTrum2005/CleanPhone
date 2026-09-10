package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.sy;
import d5.u;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f20071a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20073c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler.Callback f20076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f20077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f20078h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20074d = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20072b = 0;

    public sy(Context context, Looper looper, wy1 wy1Var) {
        this.f20075e = x10.d(new sl(context, 1));
        this.f20076f = wy1Var;
        this.f20071a = new Handler(looper);
    }

    public void a() {
        int i10 = this.f20072b;
        if (i10 == 1 || i10 == 0 || ((j1.e) this.f20078h) == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) ((na.r) this.f20075e).get();
        AudioFocusRequest audioFocusRequest = ((j1.e) this.f20078h).f43590f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public void b(int i10) {
        p1.h0 h0Var = (p1.h0) this.f20076f;
        if (h0Var != null) {
            l1.w wVar = h0Var.f48055h;
            wVar.getClass();
            l1.v vVarB = l1.w.b();
            vVarB.f44823a = wVar.f44825a.obtainMessage(33, i10, 0);
            vVarB.b();
        }
    }

    public void c(int i10) {
        if (this.f20072b == i10) {
            return;
        }
        this.f20072b = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f20074d == f10) {
            return;
        }
        this.f20074d = f10;
        p1.h0 h0Var = (p1.h0) this.f20076f;
        if (h0Var != null) {
            h0Var.f48055h.e(34);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [j1.b] */
    public int d(int i10, boolean z10) {
        int i11;
        j1.d dVar;
        boolean z11 = false;
        if (i10 == 1 || (i11 = this.f20073c) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z10) {
            int i12 = this.f20072b;
            if (i12 == 1) {
                return -1;
            }
            if (i12 == 3) {
                return 0;
            }
        } else if (this.f20072b != 2) {
            j1.e eVar = (j1.e) this.f20078h;
            if (eVar == null) {
                if (eVar == null) {
                    dVar = new j1.d();
                    dVar.f43584c = i1.e.f42531c;
                    dVar.f43583b = i11;
                } else {
                    j1.d dVar2 = new j1.d();
                    dVar2.f43583b = eVar.f43585a;
                    dVar2.f43584c = eVar.f43588d;
                    dVar2.f43582a = eVar.f43589e;
                    dVar = dVar2;
                }
                i1.e eVar2 = (i1.e) this.f20077g;
                if (eVar2 != null && eVar2.f42532a == 1) {
                    z11 = true;
                }
                eVar2.getClass();
                dVar.f43584c = eVar2;
                dVar.f43582a = z11;
                ?? r10 = new AudioManager.OnAudioFocusChangeListener() { // from class: j1.b
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i13) {
                        i1.e eVar3;
                        sy syVar = this.f43579a;
                        syVar.getClass();
                        if (i13 == -3 || i13 == -2) {
                            if (i13 != -2 && ((eVar3 = (i1.e) syVar.f20077g) == null || eVar3.f42532a != 1)) {
                                syVar.c(4);
                                return;
                            } else {
                                syVar.b(0);
                                syVar.c(3);
                                return;
                            }
                        }
                        if (i13 == -1) {
                            syVar.b(-1);
                            syVar.a();
                            syVar.c(1);
                        } else if (i13 != 1) {
                            u.v(i13, "Unknown focus change type: ", "AudioFocusManager");
                        } else {
                            syVar.c(2);
                            syVar.b(1);
                        }
                    }
                };
                Handler handler = this.f20071a;
                handler.getClass();
                this.f20078h = new j1.e(dVar.f43583b, r10, handler, (i1.e) dVar.f43584c, dVar.f43582a);
            }
            AudioManager audioManager = (AudioManager) ((na.r) this.f20075e).get();
            AudioFocusRequest audioFocusRequest = ((j1.e) this.f20078h).f43590f;
            audioFocusRequest.getClass();
            if (audioManager.requestAudioFocus(audioFocusRequest) == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }

    public void e(z80 z80Var) {
        if (Objects.equals((z80) this.f20077g, z80Var)) {
            return;
        }
        this.f20077g = z80Var;
        this.f20073c = z80Var == null ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.ww] */
    public int f(int i10, boolean z10) {
        if (i10 == 1 || this.f20073c != 1) {
            h();
            i(0);
            return 1;
        }
        if (!z10) {
            int i11 = this.f20072b;
            if (i11 == 1) {
                return -1;
            }
            if (i11 == 3) {
                return 0;
            }
        } else if (this.f20072b != 2) {
            if (((y00) this.f20078h) == null) {
                z80 z80Var = z80.f22559b;
                z80 z80Var2 = (z80) this.f20077g;
                z80Var2.getClass();
                ?? r2 = new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.ww
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final /* synthetic */ void onAudioFocusChange(int i12) {
                        sy syVar = this.f21613a;
                        syVar.getClass();
                        if (i12 == -3 || i12 == -2) {
                            if (i12 != -2) {
                                syVar.i(4);
                                return;
                            } else {
                                syVar.j(0);
                                syVar.i(3);
                                return;
                            }
                        }
                        if (i12 == -1) {
                            syVar.j(-1);
                            syVar.h();
                            syVar.i(1);
                        } else if (i12 != 1) {
                            com.applovin.impl.ca.r(new StringBuilder(String.valueOf(i12).length() + 27), "Unknown focus change type: ", i12, "AudioFocusManager");
                        } else {
                            syVar.i(2);
                            syVar.j(1);
                        }
                    }
                };
                Handler handler = this.f20071a;
                handler.getClass();
                this.f20078h = new y00(r2, handler, z80Var2);
            }
            AudioManager audioManager = (AudioManager) ((q81) this.f20075e).zza();
            AudioFocusRequest audioFocusRequest = ((y00) this.f20078h).f22062d;
            audioFocusRequest.getClass();
            int iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
            if (iRequestAudioFocus == 1 || iRequestAudioFocus == 2) {
                i(2);
                return 1;
            }
            i(1);
            return -1;
        }
        return 1;
    }

    public void g() {
        this.f20076f = null;
        h();
        i(0);
    }

    public void h() {
        int i10 = this.f20072b;
        if (i10 == 1 || i10 == 0 || ((y00) this.f20078h) == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) ((q81) this.f20075e).zza();
        AudioFocusRequest audioFocusRequest = ((y00) this.f20078h).f22062d;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public void i(int i10) {
        if (this.f20072b == i10) {
            return;
        }
        this.f20072b = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f20074d != f10) {
            this.f20074d = f10;
            wy1 wy1Var = (wy1) this.f20076f;
            if (wy1Var != null) {
                wy1Var.f21632g.c(34);
            }
        }
    }

    public void j(int i10) {
        wy1 wy1Var = (wy1) this.f20076f;
        if (wy1Var != null) {
            Handler handler = wy1Var.f21632g.f22362a;
            ss0 ss0VarG = ys0.g();
            ss0VarG.f20047a = handler.obtainMessage(33, i10, 0);
            ss0VarG.a();
        }
    }

    public sy(Context context, Looper looper, p1.h0 h0Var) {
        this.f20075e = no.b.z(new j1.c(context, 0));
        this.f20076f = h0Var;
        this.f20071a = new Handler(looper);
    }
}
