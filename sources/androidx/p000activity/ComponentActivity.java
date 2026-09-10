package androidx.p000activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.NotificationCompat;
import androidx.core.view.cuirassed;
import androidx.core.view.dovishness;
import androidx.core.view.preprohormone;
import androidx.p000activity.result.ActivityResultRegistry;
import androidx.p000activity.result.IntentSenderRequest;
import androidx.p001lifecycle.C0828overspeculate;
import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.ReportFragment;
import androidx.p001lifecycle.arytenoidectomy;
import androidx.p001lifecycle.grimness;
import androidx.p001lifecycle.mathsort;
import androidx.p001lifecycle.peridotite;
import androidx.p001lifecycle.polloi;
import androidx.p001lifecycle.restrictive;
import androidx.p001lifecycle.splinterproof;
import androidx.p001lifecycle.taiyuan;
import cig.CreationExtras;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import igbo.graveside;
import igbo.impassible;
import igbo.molybdenite;
import inrooted.impromptu;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Ý\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\u00022\u00020\f2\u00020\r2\u00020\u00022\u00020\u000e2\u00020\u000f:\nÞ\u0001ß\u0001à\u0001á\u0001â\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001eH\u0015¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b&\u0010%J\u0019\u0010(\u001a\u00020\u00152\b\b\u0001\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0014J\u0019\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b(\u0010+J#\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b(\u0010.J#\u0010/\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0015H\u0017¢\u0006\u0004\b0\u0010\u0011J\u0011\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00152\u0006\u00105\u001a\u000204¢\u0006\u0004\b8\u00107J)\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020G2\u0006\u0010K\u001a\u00020\u0003H\u0016¢\u0006\u0004\bI\u0010LJ'\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020G2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bI\u0010OJ\u0017\u0010P\u001a\u00020\u00152\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bP\u0010JJ\u000f\u0010Q\u001a\u00020\u0015H\u0016¢\u0006\u0004\bQ\u0010\u0011J\u000f\u0010R\u001a\u00020\u0015H\u0017¢\u0006\u0004\bR\u0010\u0011J\u001f\u0010V\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u0012H\u0017¢\u0006\u0004\bV\u0010WJ)\u0010V\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00122\b\u0010X\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\bV\u0010YJA\u0010_\u001a\u00020\u00152\u0006\u0010T\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010S2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017¢\u0006\u0004\b_\u0010`JK\u0010_\u001a\u00020\u00152\u0006\u0010T\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010S2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\b\u0010X\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b_\u0010aJ)\u0010d\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\u0006\u0010b\u001a\u00020\u00122\b\u0010c\u001a\u0004\u0018\u00010SH\u0015¢\u0006\u0004\bd\u0010eJ-\u0010k\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0f2\u0006\u0010j\u001a\u00020iH\u0017¢\u0006\u0004\bk\u0010lJI\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010m\"\u0004\b\u0001\u0010n2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010o2\u0006\u0010r\u001a\u00020q2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s¢\u0006\u0004\bv\u0010wJA\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010m\"\u0004\b\u0001\u0010n2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010o2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s¢\u0006\u0004\bv\u0010xJ\u0017\u0010{\u001a\u00020\u00152\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0004\b{\u0010|J\u001b\u0010~\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020y0}¢\u0006\u0004\b~\u0010\u007fJ\u001d\u0010\u0080\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020y0}¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u001a\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0081\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0082\u0001\u0010\u0014J\u001d\u0010\u0083\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120}¢\u0006\u0005\b\u0083\u0001\u0010\u007fJ\u001d\u0010\u0084\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120}¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u001a\u0010\u0085\u0001\u001a\u00020\u00152\u0006\u0010T\u001a\u00020SH\u0015¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001d\u0010\u0087\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020S0}¢\u0006\u0005\b\u0087\u0001\u0010\u007fJ\u001d\u0010\u0088\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020S0}¢\u0006\u0005\b\u0088\u0001\u0010\u007fJ\u001b\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010\u0089\u0001\u001a\u00020<H\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J#\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010\u0089\u0001\u001a\u00020<2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008c\u0001J\u001e\u0010\u008e\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010}¢\u0006\u0005\b\u008e\u0001\u0010\u007fJ\u001e\u0010\u008f\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010}¢\u0006\u0005\b\u008f\u0001\u0010\u007fJ\u001b\u0010\u0091\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020<H\u0017¢\u0006\u0006\b\u0091\u0001\u0010\u008b\u0001J#\u0010\u0091\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020<2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0006\b\u0091\u0001\u0010\u008c\u0001J\u001e\u0010\u0093\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010}¢\u0006\u0005\b\u0093\u0001\u0010\u007fJ\u001e\u0010\u0094\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010}¢\u0006\u0005\b\u0094\u0001\u0010\u007fJ\u0011\u0010\u0095\u0001\u001a\u00020\u0015H\u0015¢\u0006\u0005\b\u0095\u0001\u0010\u0011J\u0019\u0010\u0097\u0001\u001a\u00020\u00152\u0007\u00105\u001a\u00030\u0096\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0019\u0010\u0099\u0001\u001a\u00020\u00152\u0007\u00105\u001a\u00030\u0096\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u0098\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u009a\u0001\u0010\u0011R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001f\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0005\b¤\u0001\u0010\u0011R\u001c\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010¨\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R!\u0010¯\u0001\u001a\u00030ª\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010mR\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010³\u0001\u001a\u00020q8\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¹\u0001R$\u0010»\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008d\u00010}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R%\u0010½\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u00010}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¹\u0001R\u001f\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¹\u0001R\u0019\u0010¿\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Á\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010À\u0001R!\u0010Æ\u0001\u001a\u00030Â\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÃ\u0001\u0010¬\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R'\u0010Ë\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÇ\u0001\u0010¬\u0001\u0012\u0005\bÊ\u0001\u0010\u0011\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Í\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010%R\u0018\u0010Ñ\u0001\u001a\u00030Î\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Ô\u0001\u001a\u00030¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0015\u0010Ü\u0001\u001a\u00030Ù\u00018F¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001¨\u0006ã\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "", "Landroidx/lifecycle/arytenoidectomy;", "Landroidx/lifecycle/splinterproof;", "Landroidx/lifecycle/taiyuan;", "Linrooted/taiyuan;", "Landroidx/activity/restrictive;", "Lwireman/marial;", "Lwireman/saneness;", "Lpicketboat/marial;", "Lpicketboat/beachfront;", "Ligbo/molybdenite;", "Ligbo/graveside;", "Landroidx/core/view/dovishness;", "Landroidx/activity/yemenite;", "<init>", "()V", "", "contentLayoutId", "(I)V", "", "ensureViewModelStore", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/OnBackPressedDispatcher;)V", "Landroidx/activity/ComponentActivity$marial;", "createFullyDrawnExecutor", "()Landroidx/activity/ComponentActivity$marial;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Ldern/saneness;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnContextAvailableListener", "(Ldern/saneness;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/cuirassed;", IronSourceConstants.EVENTS_PROVIDER, "addMenuProvider", "(Landroidx/core/view/cuirassed;)V", "owner", "(Landroidx/core/view/cuirassed;Landroidx/lifecycle/arytenoidectomy;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "(Landroidx/core/view/cuirassed;Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", X3.f.f, "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lmarial/attabal;", "contract", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lwireman/attabal;", "callback", "Lwireman/dern;", "registerForActivityResult", "(Lmarial/attabal;Landroidx/activity/result/ActivityResultRegistry;Lwireman/attabal;)Lwireman/dern;", "(Lmarial/attabal;Lwireman/attabal;)Lwireman/dern;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Ltechnofreak/saneness;", "addOnConfigurationChangedListener", "(Ltechnofreak/saneness;)V", "removeOnConfigurationChangedListener", AppLovinEventTypes.USER_COMPLETED_LEVEL, "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Ligbo/impassible;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Ligbo/dovishness;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Ldern/attabal;", "contextAwareHelper", "Ldern/attabal;", "Landroidx/core/view/preprohormone;", "menuHostHelper", "Landroidx/core/view/preprohormone;", "Linrooted/impromptu;", "savedStateRegistryController", "Linrooted/impromptu;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/mathsort;", "_viewModelStore", "Landroidx/lifecycle/mathsort;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$marial;", "Landroidx/activity/oilcan;", "fullyDrawnReporter$delegate", "Lpatroclinal/taiyuan;", "getFullyDrawnReporter", "()Landroidx/activity/oilcan;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "getActivityResultRegistry", "()Landroidx/activity/result/ActivityResultRegistry;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/peridotite$dern;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/peridotite$dern;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/mathsort;", "viewModelStore", "Lcig/attabal;", "getDefaultViewModelCreationExtras", "()Lcig/attabal;", "defaultViewModelCreationExtras", "Linrooted/beachfront;", "getSavedStateRegistry", "()Linrooted/beachfront;", "savedStateRegistry", "Companion", "saneness", "dern", "wireman", "marial", "beachfront", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements arytenoidectomy, splinterproof, taiyuan, inrooted.taiyuan, restrictive, wireman.marial, wireman.saneness, picketboat.marial, picketboat.beachfront, molybdenite, graveside, dovishness, yemenite {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final dern Companion = new dern(null);
    private mathsort _viewModelStore;
    private final ActivityResultRegistry activityResultRegistry;
    private int contentLayoutId;
    private final dern.attabal contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final patroclinal.taiyuan defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final patroclinal.taiyuan fullyDrawnReporter;
    private final preprohormone menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final patroclinal.taiyuan onBackPressedDispatcher;
    private final CopyOnWriteArrayList<technofreak.saneness<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<technofreak.saneness<impassible>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<technofreak.saneness<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<technofreak.saneness<igbo.dovishness>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<technofreak.saneness<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final marial reportFullyDrawnExecutor;
    private final impromptu savedStateRegistryController;

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/activity/ComponentActivity$attabal", "Landroidx/lifecycle/impassible;", "Landroidx/lifecycle/arytenoidectomy;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$Event;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements androidx.p001lifecycle.impassible {
        public attabal() {
        }

        @Override // androidx.p001lifecycle.impassible
        public void onStateChanged(arytenoidectomy source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            ComponentActivity.this.ensureViewModelStore();
            ComponentActivity.this.getLifecycle().wireman(this);
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000fR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/activity/ComponentActivity$beachfront;", "Landroidx/activity/ComponentActivity$marial;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "polder", "(Landroid/view/View;)V", "marial", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "kowloon", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "arytenoidectomy", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", "", "monoploid", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class beachfront implements marial, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public Runnable currentRunnable;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final long endWatchTimeMillis = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public boolean onDrawScheduled;

        public beachfront() {
        }

        public static final void saneness(beachfront beachfrontVar) {
            Runnable runnable = beachfrontVar.currentRunnable;
            if (runnable != null) {
                Intrinsics.beachfront(runnable);
                runnable.run();
                beachfrontVar.currentRunnable = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.cutely
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.beachfront.saneness(this.f4474kowloon);
                    }
                });
            } else if (Intrinsics.wireman(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.marial
        public void marial() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ComponentActivity.this.getFullyDrawnReporter().dern()) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // androidx.activity.ComponentActivity.marial
        public void polder(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/ComponentActivity$competently", "Landroidx/activity/result/ActivityResultRegistry;", "I", "O", "", "requestCode", "Lmarial/attabal;", "contract", "input", "Ligbo/dern;", "options", "", "taiyuan", "(ILmarial/attabal;Ljava/lang/Object;Ligbo/dern;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class competently extends ActivityResultRegistry {
        public competently() {
        }

        public static final void graveside(competently competentlyVar, int i, IntentSender.SendIntentException sendIntentException) {
            competentlyVar.marial(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        public static final void molybdenite(competently competentlyVar, int i, marial.attabal.C0727attabal c0727attabal) {
            competentlyVar.beachfront(i, c0727attabal.attabal());
        }

        @Override // androidx.p000activity.result.ActivityResultRegistry
        public <I, O> void taiyuan(final int requestCode, marial.attabal<I, O> contract, I input, igbo.dern options) {
            Bundle bundleSaneness;
            final int i;
            Intrinsics.checkNotNullParameter(contract, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final marial.attabal.C0727attabal<O> c0727attabalSaneness = contract.saneness(componentActivity, input);
            if (c0727attabalSaneness != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.apical
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.competently.molybdenite(this.f4468kowloon, requestCode, c0727attabalSaneness);
                    }
                });
                return;
            }
            Intent intentAttabal = contract.attabal(componentActivity, input);
            if (intentAttabal.getExtras() != null) {
                Bundle extras = intentAttabal.getExtras();
                Intrinsics.beachfront(extras);
                if (extras.getClassLoader() == null) {
                    intentAttabal.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentAttabal.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleSaneness = intentAttabal.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentAttabal.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleSaneness = options != null ? options.saneness() : null;
            }
            Bundle bundle = bundleSaneness;
            if (Intrinsics.wireman("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentAttabal.getAction())) {
                String[] stringArrayExtra = intentAttabal.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                igbo.saneness.wireman(componentActivity, stringArrayExtra, requestCode);
                return;
            }
            if (!Intrinsics.wireman("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentAttabal.getAction())) {
                igbo.saneness.beachfront(componentActivity, intentAttabal, requestCode, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentAttabal.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.beachfront(intentSenderRequest);
                i = requestCode;
                try {
                    igbo.saneness.competently(componentActivity, intentSenderRequest.getIntentSender(), i, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.formularize
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.competently.graveside(this.f4476kowloon, i, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i = requestCode;
            }
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/ComponentActivity$dern;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class dern {
        public /* synthetic */ dern(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public dern() {
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$marial;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "polder", "(Landroid/view/View;)V", "marial", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface marial extends Executor {
        void marial();

        void polder(View view);
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/activity/ComponentActivity$saneness;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/window/OnBackInvokedDispatcher;", "attabal", "(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f4439attabal = new saneness();

        public final OnBackInvokedDispatcher attabal(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/activity/ComponentActivity$wireman;", "", "<init>", "()V", "attabal", "Ljava/lang/Object;", "()Ljava/lang/Object;", "dern", "(Ljava/lang/Object;)V", "custom", "Landroidx/lifecycle/mathsort;", "saneness", "Landroidx/lifecycle/mathsort;", "()Landroidx/lifecycle/mathsort;", "wireman", "(Landroidx/lifecycle/mathsort;)V", "viewModelStore", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public Object custom;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public mathsort viewModelStore;

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final Object getCustom() {
            return this.custom;
        }

        public final void dern(Object obj) {
            this.custom = obj;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final mathsort getViewModelStore() {
            return this.viewModelStore;
        }

        public final void wireman(mathsort mathsortVar) {
            this.viewModelStore = mathsortVar;
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new dern.attabal();
        this.menuHostHelper = new preprohormone(new Runnable() { // from class: androidx.activity.wireman
            @Override // java.lang.Runnable
            public final void run() {
                this.f4537kowloon.invalidateMenu();
            }
        });
        impromptu impromptuVarSaneness = impromptu.INSTANCE.saneness(this);
        this.savedStateRegistryController = impromptuVarSaneness;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = p002kotlin.saneness.saneness(new Function0<oilcan>() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final oilcan invoke() {
                ComponentActivity.marial marialVar = this.this$0.reportFullyDrawnExecutor;
                final ComponentActivity componentActivity = this.this$0;
                return new oilcan(marialVar, new Function0<Unit>() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2.1
                    {
                        super(0);
                    }

                    @Override // p002kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        componentActivity.reportFullyDrawn();
                    }
                });
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new competently();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().attabal(new androidx.p001lifecycle.impassible() { // from class: androidx.activity.marial
            @Override // androidx.p001lifecycle.impassible
            public final void onStateChanged(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$2(this.f4481kowloon, arytenoidectomyVar, event);
            }
        });
        getLifecycle().attabal(new androidx.p001lifecycle.impassible() { // from class: androidx.activity.beachfront
            @Override // androidx.p001lifecycle.impassible
            public final void onStateChanged(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$3(this.f4472kowloon, arytenoidectomyVar, event);
            }
        });
        getLifecycle().attabal(new attabal());
        impromptuVarSaneness.dern();
        restrictive.dern(this);
        getSavedStateRegistry().dern(ACTIVITY_RESULT_TAG, new inrooted.beachfront.saneness() { // from class: androidx.activity.competently
            @Override // inrooted.beachfront.saneness
            public final Bundle attabal() {
                return ComponentActivity._init_$lambda$4(this.f4473attabal);
            }
        });
        addOnContextAvailableListener(new dern.saneness() { // from class: androidx.activity.impromptu
            @Override // dern.saneness
            public final void attabal(Context context) {
                ComponentActivity._init_$lambda$5(this.f4479attabal, context);
            }
        });
        this.defaultViewModelProviderFactory = p002kotlin.saneness.saneness(new Function0<grimness>() { // from class: androidx.activity.ComponentActivity$defaultViewModelProviderFactory$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final grimness invoke() {
                Application application = this.this$0.getApplication();
                ComponentActivity componentActivity = this.this$0;
                return new grimness(application, componentActivity, componentActivity.getIntent() != null ? this.this$0.getIntent().getExtras() : null);
            }
        });
        this.onBackPressedDispatcher = p002kotlin.saneness.saneness(new ComponentActivity$onBackPressedDispatcher$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != Lifecycle.Event.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.saneness();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().attabal();
            }
            componentActivity.reportFullyDrawnExecutor.marial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.apical(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleAttabal = componentActivity.getSavedStateRegistry().attabal(ACTIVITY_RESULT_TAG);
        if (bundleAttabal != null) {
            componentActivity.activityResultRegistry.cutely(bundleAttabal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher dispatcher) {
        getLifecycle().attabal(new androidx.p001lifecycle.impassible() { // from class: androidx.activity.taiyuan
            @Override // androidx.p001lifecycle.impassible
            public final void onStateChanged(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(dispatcher, this, arytenoidectomyVar, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            onBackPressedDispatcher.kowloon(saneness.f4439attabal.attabal(componentActivity));
        }
    }

    private final marial createFullyDrawnExecutor() {
        return new beachfront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            wireman wiremanVar = (wireman) getLastNonConfigurationInstance();
            if (wiremanVar != null) {
                this._viewModelStore = wiremanVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new mathsort();
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        marial marialVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        marialVar.polder(decorView);
        super.addContentView(view, params);
    }

    @Override // androidx.core.view.dovishness
    public void addMenuProvider(cuirassed provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.dern(provider);
    }

    @Override // picketboat.marial
    public final void addOnConfigurationChangedListener(technofreak.saneness<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(dern.saneness listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.attabal(listener);
    }

    @Override // igbo.molybdenite
    public final void addOnMultiWindowModeChangedListener(technofreak.saneness<impassible> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(technofreak.saneness<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // igbo.graveside
    public final void addOnPictureInPictureModeChangedListener(technofreak.saneness<igbo.dovishness> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // picketboat.beachfront
    public final void addOnTrimMemoryListener(technofreak.saneness<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // wireman.marial
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.p001lifecycle.taiyuan
    public CreationExtras getDefaultViewModelCreationExtras() {
        cig.saneness sanenessVar = new cig.saneness(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        if (getApplication() != null) {
            CreationExtras.dern<Application> dernVar = peridotite.attabal.f10510impromptu;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            sanenessVar.dern(dernVar, application);
        }
        sanenessVar.dern(restrictive.f10539attabal, this);
        sanenessVar.dern(restrictive.f10541saneness, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            sanenessVar.dern(restrictive.f10540dern, extras);
        }
        return sanenessVar;
    }

    @Override // androidx.p001lifecycle.taiyuan
    public peridotite.dern getDefaultViewModelProviderFactory() {
        return (peridotite.dern) this.defaultViewModelProviderFactory.getValue();
    }

    public oilcan getFullyDrawnReporter() {
        return (oilcan) this.fullyDrawnReporter.getValue();
    }

    @patroclinal.wireman
    public Object getLastCustomNonConfigurationInstance() {
        wireman wiremanVar = (wireman) getLastNonConfigurationInstance();
        if (wiremanVar != null) {
            return wiremanVar.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.p001lifecycle.arytenoidectomy
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.p000activity.restrictive
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher.getValue();
    }

    @Override // inrooted.taiyuan
    public final inrooted.beachfront getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.p001lifecycle.splinterproof
    public mathsort getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        mathsort mathsortVar = this._viewModelStore;
        Intrinsics.beachfront(mathsortVar);
        return mathsortVar;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        C0828overspeculate.saneness(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        androidx.p001lifecycle.View.attabal(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        inrooted.impassible.saneness(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        C0824seminary.attabal(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        View.attabal(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @patroclinal.wireman
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.marial(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @patroclinal.wireman
    public void onBackPressed() {
        getOnBackPressedDispatcher().formularize();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<technofreak.saneness<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.wireman(savedInstanceState);
        this.contextAwareHelper.dern(this);
        super.onCreate(savedInstanceState);
        ReportFragment.INSTANCE.dern(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.beachfront(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.impromptu(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @patroclinal.wireman
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<technofreak.saneness<impassible>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new impassible(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<technofreak.saneness<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.competently(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    @patroclinal.wireman
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<technofreak.saneness<igbo.dovishness>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new igbo.dovishness(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.taiyuan(menu);
        return true;
    }

    @Override // android.app.Activity
    @patroclinal.wireman
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.marial(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @patroclinal.wireman
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        wireman wiremanVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        mathsort viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (wiremanVar = (wireman) getLastNonConfigurationInstance()) != null) {
            viewModelStore = wiremanVar.getViewModelStore();
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        wireman wiremanVar2 = new wireman();
        wiremanVar2.dern(objOnRetainCustomNonConfigurationInstance);
        wiremanVar2.wireman(viewModelStore);
        return wiremanVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof polloi) {
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.competently(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((polloi) lifecycle).triweekly(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.marial(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<technofreak.saneness<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.getContext();
    }

    public final <I, O> wireman.dern<I> registerForActivityResult(marial.attabal<I, O> contract, ActivityResultRegistry registry, wireman.attabal<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.formularize("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.dovishness
    public void removeMenuProvider(cuirassed provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.cutely(provider);
    }

    @Override // picketboat.marial
    public final void removeOnConfigurationChangedListener(technofreak.saneness<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(dern.saneness listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.marial(listener);
    }

    @Override // igbo.molybdenite
    public final void removeOnMultiWindowModeChangedListener(technofreak.saneness<impassible> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(technofreak.saneness<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // igbo.graveside
    public final void removeOnPictureInPictureModeChangedListener(technofreak.saneness<igbo.dovishness> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // picketboat.beachfront
    public final void removeOnTrimMemoryListener(technofreak.saneness<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ferrovanadium.attabal.wireman()) {
                ferrovanadium.attabal.attabal("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().saneness();
        } finally {
            ferrovanadium.attabal.saneness();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        marial marialVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        marialVar.polder(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @patroclinal.wireman
    public void startActivityForResult(Intent intent, int requestCode) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @patroclinal.wireman
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void addMenuProvider(cuirassed provider, arytenoidectomy owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.menuHostHelper.wireman(provider, owner);
    }

    @Override // android.app.Activity
    @patroclinal.wireman
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @patroclinal.wireman
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void addMenuProvider(cuirassed provider, arytenoidectomy owner, Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        this.menuHostHelper.marial(provider, owner, state);
    }

    @Override // wireman.saneness
    public final <I, O> wireman.dern<I> registerForActivityResult(marial.attabal<I, O> contract, wireman.attabal<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<technofreak.saneness<impassible>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new impassible(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<technofreak.saneness<igbo.dovishness>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new igbo.dovishness(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        marial marialVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        marialVar.polder(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        marial marialVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        marialVar.polder(decorView);
        super.setContentView(view, params);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
