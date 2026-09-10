package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.badlogic.gdx.Input;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4295pC extends B9 {
    public final /* synthetic */ int D;
    public final VG E;
    public C3103bh0 F;
    public C3103bh0 G;
    public final Parcelable H;
    public final Object I;
    public final Object J;
    public final Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4295pC(C3160cK c3160cK, ZG zg, int i) {
        super(c3160cK, zg);
        this.D = i;
        if (i != 1) {
            this.E = new VG(3);
            this.H = new Rect();
            this.I = new Rect();
            MJ mj = c3160cK.f4216a;
            this.J = mj == null ? null : (C3425fK) mj.c().get(zg.g);
            L4 l4 = this.p.x;
            if (l4 != null) {
                this.K = new C3910kq(this, this, l4);
                return;
            }
            return;
        }
        super(c3160cK, zg);
        this.H = new RectF();
        VG vg = new VG();
        this.E = vg;
        this.I = new float[8];
        this.J = new Path();
        this.K = zg;
        vg.setAlpha(0);
        vg.setStyle(Paint.Style.FILL);
        vg.setColor(zg.l);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.n;
        switch (this.D) {
            case 0:
                super.d(rectF, matrix, z);
                C3425fK c3425fK = (C3425fK) this.J;
                if (c3425fK != null) {
                    float fC = AbstractC3014ah0.c();
                    rectF.set(0.0f, 0.0f, c3425fK.f4364a * fC, c3425fK.b * fC);
                    matrix2.mapRect(rectF);
                }
                break;
            default:
                super.d(rectF, matrix, z);
                RectF rectF2 = (RectF) this.H;
                ZG zg = (ZG) this.K;
                rectF2.set(0.0f, 0.0f, zg.j, zg.k);
                matrix2.mapRect(rectF2);
                rectF.set(rectF2);
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        switch (this.D) {
            case 0:
                super.g(c4215oK, obj);
                if (obj != InterfaceC3689iK.F) {
                    if (obj == InterfaceC3689iK.I) {
                        if (c4215oK != null) {
                            this.G = new C3103bh0(c4215oK, null);
                        } else {
                            this.G = null;
                        }
                    }
                } else if (c4215oK != null) {
                    this.F = new C3103bh0(c4215oK, null);
                } else {
                    this.F = null;
                }
                break;
            default:
                super.g(c4215oK, obj);
                if (obj != InterfaceC3689iK.F) {
                    if (obj == 1) {
                        if (c4215oK != null) {
                            this.G = new C3103bh0(c4215oK, null);
                        } else {
                            this.G = null;
                            this.E.setColor(((ZG) this.K).l);
                        }
                    }
                } else if (c4215oK != null) {
                    this.F = new C3103bh0(c4215oK, null);
                } else {
                    this.F = null;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fc  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B9
    public final void j(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmap;
        Bitmap bitmapD;
        Bitmap bitmap2;
        C3425fK c3425fK;
        Bitmap bitmap3;
        int i2 = this.D;
        Object obj = this.J;
        Object obj2 = this.I;
        VG vg = this.E;
        switch (i2) {
            case 0:
                C3103bh0 c3103bh0 = this.G;
                C3160cK c3160cK = this.o;
                if (c3103bh0 == null || (bitmap3 = (Bitmap) c3103bh0.e()) == null) {
                    String str = this.p.g;
                    C3681iC c3681iC = c3160cK.g;
                    if (c3681iC != null) {
                        Context contextH = c3160cK.h();
                        Context context = c3681iC.f4492a;
                        if (contextH != null) {
                            if (context instanceof Application) {
                                contextH = contextH.getApplicationContext();
                            }
                            if (contextH != context) {
                                c3160cK.g = null;
                            }
                        } else if (context != null) {
                            c3160cK.g = null;
                        }
                    }
                    if (c3160cK.g == null) {
                        c3160cK.g = new C3681iC(c3160cK.getCallback(), c3160cK.h, c3160cK.f4216a.c());
                    }
                    C3681iC c3681iC2 = c3160cK.g;
                    if (c3681iC2 != null) {
                        String str2 = c3681iC2.b;
                        C3425fK c3425fK2 = (C3425fK) c3681iC2.c.get(str);
                        if (c3425fK2 != null) {
                            bitmapD = c3425fK2.f;
                            if (bitmapD != null) {
                                bitmap = null;
                            } else {
                                Context context2 = c3681iC2.f4492a;
                                if (context2 == null) {
                                    bitmap = null;
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inScaled = true;
                                    options.inDensity = Input.Keys.NUMPAD_ENTER;
                                    String str3 = c3425fK2.d;
                                    boolean zStartsWith = str3.startsWith("data:");
                                    int i3 = c3425fK2.b;
                                    int i4 = c3425fK2.f4364a;
                                    if (!zStartsWith || str3.indexOf("base64,") <= 0) {
                                        try {
                                            if (TextUtils.isEmpty(str2)) {
                                                bitmap = null;
                                                try {
                                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                                } catch (IOException e) {
                                                    e = e;
                                                }
                                            } else {
                                                bitmap = null;
                                                try {
                                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                                    if (bitmapDecodeStream == null) {
                                                        AbstractC5005xJ.b("Decoded image `" + str + "` is null.");
                                                    } else {
                                                        bitmapD = AbstractC3014ah0.d(bitmapDecodeStream, i4, i3);
                                                        c3681iC2.a(str, bitmapD);
                                                    }
                                                } catch (IllegalArgumentException e2) {
                                                    AbstractC5005xJ.c("Unable to decode image `" + str + "`.", e2);
                                                }
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                            bitmap = null;
                                        }
                                        AbstractC5005xJ.c("Unable to open asset.", e);
                                    } else {
                                        try {
                                            byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                            bitmapD = AbstractC3014ah0.d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), i4, i3);
                                            synchronized (C3681iC.d) {
                                                ((C3425fK) c3681iC2.c.get(str)).f = bitmapD;
                                                break;
                                            }
                                            bitmap = null;
                                        } catch (IllegalArgumentException e4) {
                                            AbstractC5005xJ.c("data URL did not have correct base64 format.", e4);
                                            bitmap = null;
                                            bitmapD = null;
                                        }
                                    }
                                }
                                bitmapD = bitmap;
                            }
                        } else {
                            bitmap = null;
                            bitmapD = bitmap;
                        }
                    } else {
                        bitmap = null;
                        bitmapD = bitmap;
                    }
                    if (bitmapD != null) {
                        bitmap2 = bitmapD;
                    } else {
                        C3425fK c3425fK3 = (C3425fK) obj;
                        bitmap2 = c3425fK3 != null ? c3425fK3.f : bitmap;
                    }
                } else {
                    bitmap2 = bitmap3;
                }
                if (bitmap2 == null || bitmap2.isRecycled() || (c3425fK = (C3425fK) obj) == null) {
                    return;
                }
                float fC = AbstractC3014ah0.c();
                vg.setAlpha(i);
                C3103bh0 c3103bh1 = this.F;
                if (c3103bh1 != null) {
                    vg.setColorFilter((ColorFilter) c3103bh1.e());
                }
                canvas.save();
                canvas.concat(matrix);
                Rect rect = (Rect) this.H;
                rect.set(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                if (c3160cK.m) {
                    ((Rect) obj2).set(0, 0, (int) (c3425fK.f4364a * fC), (int) (c3425fK.b * fC));
                } else {
                    ((Rect) obj2).set(0, 0, (int) (bitmap2.getWidth() * fC), (int) (bitmap2.getHeight() * fC));
                }
                C3910kq c3910kq = (C3910kq) this.K;
                if (c3910kq != null) {
                    c3910kq.b(vg, matrix, i);
                }
                canvas.drawBitmap(bitmap2, rect, (Rect) obj2, vg);
                canvas.restore();
                return;
            default:
                int iAlpha = Color.alpha(((ZG) this.K).l);
                if (iAlpha == 0) {
                    return;
                }
                C3103bh0 c3103bh2 = this.G;
                Integer num = c3103bh2 != null ? (Integer) c3103bh2.e() : null;
                if (num != null) {
                    vg.setColor(num.intValue());
                } else {
                    vg.setColor(((ZG) this.K).l);
                }
                AbstractC5170z9 abstractC5170z9 = this.w.j;
                int iIntValue = (int) ((((iAlpha / 255.0f) * (abstractC5170z9 == null ? 100 : ((Integer) abstractC5170z9.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
                vg.setAlpha(iIntValue);
                C3103bh0 c3103bh3 = this.F;
                if (c3103bh3 != null) {
                    vg.setColorFilter((ColorFilter) c3103bh3.e());
                }
                if (iIntValue > 0) {
                    float[] fArr = (float[]) obj2;
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    ZG zg = (ZG) this.K;
                    float f = zg.j;
                    fArr[2] = f;
                    fArr[3] = 0.0f;
                    fArr[4] = f;
                    float f2 = zg.k;
                    fArr[5] = f2;
                    fArr[6] = 0.0f;
                    fArr[7] = f2;
                    matrix.mapPoints(fArr);
                    Path path = (Path) obj;
                    path.reset();
                    path.moveTo(fArr[0], fArr[1]);
                    path.lineTo(fArr[2], fArr[3]);
                    path.lineTo(fArr[4], fArr[5]);
                    path.lineTo(fArr[6], fArr[7]);
                    path.lineTo(fArr[0], fArr[1]);
                    path.close();
                    canvas.drawPath(path, vg);
                    return;
                }
                return;
        }
    }
}
