package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SettingActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogRateUsBinding;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4140nX extends WG implements InterfaceC2766Sw {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4140nX(Object obj, int i) {
        super(1);
        this.f = i;
        this.g = obj;
    }

    public final String b(int i) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 14:
                StringBuilder sb = new StringBuilder();
                F40 f40 = (F40) obj;
                sb.append(f40.f[i]);
                sb.append(": ");
                sb.append(f40.g[i].h());
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder();
                C3348eV c3348eV = (C3348eV) obj;
                sb2.append(c3348eV.e[i]);
                sb2.append(": ");
                sb2.append(c3348eV.g(i).h());
                return sb2.toString();
        }
    }

    public final void c(View view) {
        C5027xc0 c5027xc0;
        C3355eb c3355eb;
        boolean z;
        switch (this.f) {
            case 0:
                AbstractC2995aW.q(view, "it");
                Context context = ((DialogC4228oX) this.g).getContext();
                AbstractC2995aW.p(context, "getContext(...)");
                C2498In c2498In = App.n;
                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                DialogC4228oX dialogC4228oX = (DialogC4228oX) this.g;
                if (dialogC4228oX.d) {
                    S3.b("rate_pop_click", "settings," + ((int) ((DialogRateUsBinding) dialogC4228oX.a()).ratingBar.getRating()));
                } else {
                    int rating = (int) ((DialogRateUsBinding) dialogC4228oX.a()).ratingBar.getRating();
                    S3.b("rate_pop_click", "settings," + C4755uX.e + "," + rating);
                }
                ((DialogRateUsBinding) ((DialogC4228oX) this.g).a()).tvRate.setBackgroundResource(R.drawable.bt_rate_bg_light);
                if (((int) ((DialogRateUsBinding) ((DialogC4228oX) this.g).a()).ratingBar.getRating()) == 5) {
                    if (VC.e == null) {
                        synchronized (VC.class) {
                            try {
                                if (VC.e == null) {
                                    VC.e = new VC(0);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    VC vc = VC.e;
                    DialogC4228oX dialogC4228oX2 = (DialogC4228oX) this.g;
                    vc.h(dialogC4228oX2.c, new C4052mX(dialogC4228oX2));
                    break;
                }
                AbstractC3651ht.b((DialogC4228oX) this.g);
                return;
            default:
                AbstractC2995aW.q(view, "it");
                C3109bk0 c3109bk0 = (C3109bk0) this.g;
                int i = c3109bk0.f.h;
                if (i == 0) {
                    S3.b("setting_page_display", "use_machine_gun");
                } else if (i == 1) {
                    S3.b("setting_page_display", "use_lightsaber");
                } else if (i == 2) {
                    S3.b("setting_page_display", "use_taser");
                } else if (i == 3) {
                    S3.b("setting_page_display", "use_time_bomb");
                } else if (i == 4) {
                    S3.b("setting_page_display", "use_sci_fi_gun");
                }
                c3109bk0.f5044a.startActivity(new Intent(c3109bk0.f5044a, (Class<?>) SettingActivity.class));
                if ((c3109bk0.e instanceof TimeBomb) && (c5027xc0 = c3109bk0.l) != null && (c3355eb = c5027xc0.c) != null && (z = c3355eb.E) && z) {
                    c5027xc0.a().removeMessages(888);
                    c5027xc0.x = c5027xc0.t - (System.currentTimeMillis() - c5027xc0.v);
                    C3355eb c3355eb2 = c5027xc0.c;
                    if (c3355eb2 != null) {
                        c3355eb2.q();
                    }
                    C3355eb c3355eb3 = c5027xc0.c;
                    if (c3355eb3 != null) {
                        c3355eb3.E = false;
                    }
                    c5027xc0.y = true;
                    c5027xc0.c(true);
                    c5027xc0.d(c5027xc0.x);
                    return;
                }
                return;
        }
    }

    public final void d(C3275df c3275df) {
        D40 descriptor;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 12:
                AbstractC2995aW.q(c3275df, "$this$buildSerialDescriptor");
                InterfaceC4123nG interfaceC4123nG = ((C2831Vj) obj).b;
                List annotations = (interfaceC4123nG == null || (descriptor = interfaceC4123nG.getDescriptor()) == null) ? null : descriptor.getAnnotations();
                if (annotations == null) {
                    annotations = C2812Uq.f3846a;
                }
                c3275df.f4282a = annotations;
                break;
            case 13:
                AbstractC2995aW.q(c3275df, "$this$buildSerialDescriptor");
                C3275df.a(c3275df, "type", W90.b);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Polymorphic<");
                C3874kV c3874kV = (C3874kV) obj;
                sb.append(((C3186cf) c3874kV.f4600a).b());
                sb.append('>');
                C3275df.a(c3275df, AppMeasurementSdk.ConditionalUserProperty.VALUE, AbstractC3375el.i(sb.toString(), J40.f3253a, new D40[0], I40.f));
                C2812Uq c2812Uq = c3874kV.b;
                AbstractC2995aW.q(c2812Uq, "<set-?>");
                c3275df.f4282a = c2812Uq;
                break;
            case 14:
            default:
                AbstractC2995aW.q(c3275df, "$this$buildClassSerialDescriptor");
                C2831Vj c2831Vj = (C2831Vj) obj;
                C3275df.a(c3275df, "first", c2831Vj.b.getDescriptor());
                C3275df.a(c3275df, "second", ((InterfaceC4123nG) c2831Vj.d).getDescriptor());
                C3275df.a(c3275df, "third", ((InterfaceC4123nG) c2831Vj.e).getDescriptor());
                break;
            case 15:
                AbstractC2995aW.q(c3275df, "$this$buildSerialDescriptor");
                C2812Uq c2812Uq2 = ((C2476Hr) obj).d;
                AbstractC2995aW.q(c2812Uq2, "<set-?>");
                c3275df.f4282a = c2812Uq2;
                break;
        }
    }

    public final void e(AbstractC4122nF abstractC4122nF) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 18:
                AbstractC2995aW.q(abstractC4122nF, "node");
                AbstractC4623t abstractC4623t = (AbstractC4623t) obj;
                abstractC4623t.L((String) AbstractC2853Wf.m0(abstractC4623t.f2920a), abstractC4122nF);
                break;
            default:
                AbstractC2995aW.q(abstractC4122nF, "it");
                ((C3086bY) obj).f4172a = abstractC4122nF;
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final Object invoke(Object obj) {
        String strValueOf;
        Object objV;
        Throwable th;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                c((View) obj);
                return c5033xf0;
            case 1:
                c((View) obj);
                return c5033xf0;
            case 2:
                return obj == ((AbstractC3658i) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 3:
                String str = (String) obj;
                AbstractC2995aW.q(str, "it");
                ((ArrayList) obj2).add(str);
                return c5033xf0;
            case 4:
                C4387qG c4387qG = (C4387qG) obj;
                AbstractC2995aW.q(c4387qG, "it");
                ((Be0) obj2).getClass();
                EnumC4474rG enumC4474rG = c4387qG.f4875a;
                if (enumC4474rG == null) {
                    return ProxyConfig.MATCH_ALL_SCHEMES;
                }
                InterfaceC4211oG interfaceC4211oG = c4387qG.b;
                Be0 be0 = interfaceC4211oG instanceof Be0 ? (Be0) interfaceC4211oG : null;
                if (be0 == null || (strValueOf = be0.a(true)) == null) {
                    strValueOf = String.valueOf(interfaceC4211oG);
                }
                int iOrdinal = enumC4474rG.ordinal();
                if (iOrdinal == 0) {
                    return strValueOf;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(strValueOf);
                }
                if (iOrdinal == 2) {
                    return "out ".concat(strValueOf);
                }
                throw new C3770jF(7, 0);
            case 5:
                AbstractC2995aW.q(obj, "it");
                return ((InterfaceC2714Qw) obj2).invoke();
            case 6:
                C3153cD c3153cD = (C3153cD) obj;
                AbstractC2995aW.q(c3153cD, "it");
                return (Boolean) ((InterfaceC3567gx) obj2).invoke(Integer.valueOf(c3153cD.f4212a), c3153cD.b);
            case 7:
                String str2 = (String) obj;
                AbstractC2995aW.q(str2, "line");
                return DM.m(new StringBuilder(), (String) obj2, str2);
            case 8:
                C5175zD c5175zD = (C5175zD) obj;
                AbstractC2995aW.q(c5175zD, "it");
                return AbstractC3089ba0.P0((CharSequence) obj2, c5175zD);
            case 9:
                switch (i) {
                    case 9:
                        ((InterfaceC2772Tc) obj2).resumeWith(c5033xf0);
                        return c5033xf0;
                    default:
                        ((C3580h40) obj2).b();
                        return c5033xf0;
                }
            case 10:
                Throwable th2 = (Throwable) obj;
                try {
                    th = (Throwable) ((InterfaceC2766Sw) obj2).invoke(th2);
                    boolean zI = AbstractC2995aW.i(th2.getMessage(), th.getMessage());
                    objV = th;
                    if (!zI && !AbstractC2995aW.i(th.getMessage(), th2.toString())) {
                        objV = th;
                        objV = null;
                    }
                } catch (Throwable th3) {
                    objV = AbstractC3375el.v(th3);
                }
                objV = th;
                return (Throwable) (objV instanceof HZ ? null : objV);
            case 11:
                switch (i) {
                    case 9:
                        ((InterfaceC2772Tc) obj2).resumeWith(c5033xf0);
                        return c5033xf0;
                    default:
                        ((C3580h40) obj2).b();
                        return c5033xf0;
                }
            case 12:
                d((C3275df) obj);
                return c5033xf0;
            case 13:
                d((C3275df) obj);
                return c5033xf0;
            case 14:
                return b(((Number) obj).intValue());
            case 15:
                d((C3275df) obj);
                return c5033xf0;
            case 16:
                return b(((Number) obj).intValue());
            case 17:
                d((C3275df) obj);
                return c5033xf0;
            case 18:
                e((AbstractC4122nF) obj);
                return c5033xf0;
            case 19:
                e((AbstractC4122nF) obj);
                return c5033xf0;
            case 20:
                AbstractC2995aW.q((List) obj, "it");
                return (InterfaceC4123nG) obj2;
            default:
                AbstractC2995aW.q((IOException) obj, "it");
                byte[] bArr = Vg0.f3884a;
                ((C3821jp) obj2).m = true;
                return c5033xf0;
        }
    }
}
