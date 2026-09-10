package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.efs.sdk.base.Constants;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.unity3d.ads.IUnityAdsTokenListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Md0 implements Interpolator, InputConnectionCompat.OnCommitContentListener, IUnityAdsTokenListener, Ka0, C20, BI, InterfaceC2494Ij, InterfaceC4934wa, AccessibilityViewCommand, CanvasCompat.CanvasOperation, Continuation, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3412a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Md0(Object obj, int i) {
        this.f3412a = i;
        this.b = obj;
    }

    public final void a(Display display) {
        C5213zh0 c5213zh0 = (C5213zh0) this.b;
        c5213zh0.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c5213zh0.k = refreshRate;
            c5213zh0.l = (refreshRate * 80) / 100;
        } else {
            AbstractC4038mJ.f();
            c5213zh0.k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            c5213zh0.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2494Ij
    public final void accept(Object obj) {
        ((C3031aq) obj).e((Exception) this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
    public final Object apply(Object obj) {
        URL url;
        int i = this.f3412a;
        Object obj2 = this.b;
        switch (i) {
            case 4:
                C3359ed c3359ed = (C3359ed) obj2;
                C3182cd c3182cd = (C3182cd) obj;
                c3359ed.getClass();
                URL url2 = c3182cd.f4231a;
                if (Log.isLoggable(AbstractC2871Wx.f0("CctTransportBackend"), 4)) {
                    String.format("Making request to: %s", url2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) c3182cd.f4231a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(c3359ed.g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
                httpURLConnection.setRequestProperty(HttpResponseHeader.ContentEncoding, Constants.CP_GZIP);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty(HttpRequestHeader.AcceptEncoding, Constants.CP_GZIP);
                String str = c3182cd.c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    try {
                        try {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                                try {
                                    c3359ed.f4324a.k(c3182cd.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                                    gZIPOutputStream.close();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    int responseCode = httpURLConnection.getResponseCode();
                                    Integer numValueOf = Integer.valueOf(responseCode);
                                    if (Log.isLoggable(AbstractC2871Wx.f0("CctTransportBackend"), 4)) {
                                        String.format("Status Code: %d", numValueOf);
                                    }
                                    AbstractC2871Wx.X("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                                    AbstractC2871Wx.X("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(HttpResponseHeader.ContentEncoding));
                                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                        return new C3271dd(responseCode, new URL(httpURLConnection.getHeaderField(HttpResponseHeader.Location)), 0L);
                                    }
                                    if (responseCode != 200) {
                                        return new C3271dd(responseCode, null, 0L);
                                    }
                                    InputStream inputStream = httpURLConnection.getInputStream();
                                    try {
                                        InputStream gZIPInputStream = Constants.CP_GZIP.equals(httpURLConnection.getHeaderField(HttpResponseHeader.ContentEncoding)) ? new GZIPInputStream(inputStream) : inputStream;
                                        try {
                                            C3271dd c3271dd = new C3271dd(responseCode, null, C3499g8.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f4405a);
                                            if (gZIPInputStream != null) {
                                                gZIPInputStream.close();
                                            }
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            return c3271dd;
                                        } catch (Throwable th) {
                                            if (gZIPInputStream == null) {
                                                throw th;
                                            }
                                            try {
                                                gZIPInputStream.close();
                                                throw th;
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        if (inputStream == null) {
                                            throw th3;
                                        }
                                        try {
                                            inputStream.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    try {
                                        gZIPOutputStream.close();
                                        throw th5;
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th7) {
                                if (outputStream == null) {
                                    throw th7;
                                }
                                try {
                                    outputStream.close();
                                    throw th7;
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                    throw th7;
                                }
                            }
                        } catch (ConnectException | UnknownHostException unused) {
                            url = null;
                            AbstractC2871Wx.f0("CctTransportBackend");
                            return new C3271dd(500, url, 0L);
                        }
                    } catch (ConnectException | UnknownHostException unused2) {
                        url = null;
                        AbstractC2871Wx.f0("CctTransportBackend");
                        return new C3271dd(500, url, 0L);
                    }
                } catch (C3823jr | IOException unused3) {
                    AbstractC2871Wx.f0("CctTransportBackend");
                    return new C3271dd(400, null, 0L);
                }
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                C3736ir c3736ir = E20.f;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    Set hashSet = (Set) map.get(Long.valueOf(j));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j), hashSet);
                    }
                    hashSet.add(new D20(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4934wa
    public final long c(long j) {
        C3036av c3036av = (C3036av) this.b;
        return Ug0.k((j * ((long) c3036av.e)) / 1000000, 0L, c3036av.j - 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ka0
    public final Object execute() {
        int i = this.f3412a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 5:
                E20 e20 = (E20) ((InterfaceC3562gs) obj);
                Integer num = (Integer) e20.k(new C5069y20(e20, ((C5211zg0) e20.b).a() - e20.d.d, i2));
                num.getClass();
                return num;
            case 6:
                E20 e21 = (E20) ((C5123yg0) obj).i;
                e21.getClass();
                e21.k(new A20(e21, i2));
                return null;
            case 7:
                E20 e22 = (E20) ((InterfaceC4768uf) obj);
                e22.getClass();
                int i3 = C5120yf.e;
                C3844k50 c3844k50 = new C3844k50(3);
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseH = e22.h();
                sQLiteDatabaseH.beginTransaction();
                try {
                    C5120yf c5120yf = (C5120yf) E20.p(sQLiteDatabaseH.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C2351Cw(e22, map, c3844k50, 5));
                    sQLiteDatabaseH.setTransactionSuccessful();
                    return c5120yf;
                } finally {
                    sQLiteDatabaseH.endTransaction();
                }
            default:
                C3290dm0 c3290dm0 = (C3290dm0) obj;
                E20 e23 = (E20) c3290dm0.b;
                e23.getClass();
                Iterator it = ((Iterable) e23.k(new Nd0(11))).iterator();
                while (it.hasNext()) {
                    ((FE) c3290dm0.c).a((Sd0) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$0((String) this.b, f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        int i = this.f3412a;
        Object obj2 = this.b;
        switch (i) {
            case 12:
                int i2 = C2736Rs.k0;
                ((JU) obj).m((C3955lO) obj2);
                break;
            case 13:
                ((JU) obj).onCues((List) obj2);
                break;
            case 14:
                ((JU) obj).h((C2469Hk) obj2);
                break;
            case 15:
                ((JU) obj).m(((SurfaceHolderCallbackC2658Os) obj2).f3526a.N);
                break;
            case 16:
                ((JU) obj).i((Metadata) obj2);
                break;
            case 17:
                ((JU) obj).C((C2421Fo) obj2);
                break;
            default:
                ((JU) obj).a((Ih0) obj2);
                break;
        }
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.b, inputContentInfoCompat, i, bundle);
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public final void onUnityAdsTokenReady(String str) {
        SignalCallbacks signalCallbacks = (SignalCallbacks) this.b;
        if (str == null) {
            str = "";
        }
        signalCallbacks.onSuccess(str);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return ((BottomSheetDragHandleView) this.b).lambda$onBottomSheetStateChanged$0(view, commandArguments);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public final void run(Canvas canvas) {
        int i = this.f3412a;
        Object obj = this.b;
        switch (i) {
            case 26:
                ((MaskableFrameLayout) obj).lambda$dispatchDraw$1(canvas);
                break;
            default:
                ((NavigationView) obj).lambda$dispatchDraw$0(canvas);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        C2855Wh c2855Wh = (C2855Wh) this.b;
        int[] iArr = C2881Xh.k;
        return Tasks.forResult(c2855Wh);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws IOException {
        ((C4092mw) this.b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string2 != null) {
                throw new IOException(string2);
            }
            bundle.toString();
            new Throwable();
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
