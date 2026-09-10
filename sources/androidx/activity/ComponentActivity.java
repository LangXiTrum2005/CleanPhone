package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.i0;
import androidx.fragment.app.k0;
import androidx.fragment.app.x0;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.lifecycle.i;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.r0;
import androidx.lifecycle.x;
import androidx.lifecycle.y0;
import b0.m0;
import b0.n0;
import b0.p0;
import c0.d;
import c0.e;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.storage.androidcleaner.R;
import f.b;
import f.c;
import f.f;
import f.j;
import f.t;
import f.v;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import h.h;
import j4.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import l0.a;
import m0.n;
import m0.p;
import m0.q;
import m0.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 Û\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u00022\u00020\b2\u00020\u00022\u00020\t2\u00020\n2\u00020\u00022\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u0002:\bÜ\u0001\u009b\u0001Ý\u0001Þ\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00122\b\b\u0001\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001a\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001eJ#\u0010\u001a\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001a\u0010!J#\u0010\"\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0012H\u0017¢\u0006\u0004\b#\u0010\u000fJ\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J)\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020/2\u0006\u0010,\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020/2\u0006\u0010,\u001a\u00020\u00182\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010>\u001a\u00020\u0003H\u0016¢\u0006\u0004\b<\u0010?J'\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010A\u001a\u00020@H\u0017¢\u0006\u0004\b<\u0010BJ\u0017\u0010C\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bC\u0010=J\u000f\u0010D\u001a\u00020\u0012H\u0016¢\u0006\u0004\bD\u0010\u000fJ\u000f\u0010E\u001a\u00020\u0012H\u0017¢\u0006\u0004\bE\u0010\u000fJ\u001f\u0010I\u001a\u00020\u00122\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\u0018H\u0017¢\u0006\u0004\bI\u0010JJ)\u0010I\u001a\u00020\u00122\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\bI\u0010LJA\u0010R\u001a\u00020\u00122\u0006\u0010G\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00182\b\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010O\u001a\u00020\u00182\u0006\u0010P\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020\u0018H\u0017¢\u0006\u0004\bR\u0010SJK\u0010R\u001a\u00020\u00122\u0006\u0010G\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00182\b\u0010N\u001a\u0004\u0018\u00010F2\u0006\u0010O\u001a\u00020\u00182\u0006\u0010P\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\bR\u0010TJ)\u0010W\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00182\u0006\u0010U\u001a\u00020\u00182\b\u0010V\u001a\u0004\u0018\u00010FH\u0015¢\u0006\u0004\bW\u0010XJ-\u0010^\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00182\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y2\u0006\u0010]\u001a\u00020\\H\u0017¢\u0006\u0004\b^\u0010_JI\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b2\u0006\u0010e\u001a\u00020d2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00010f¢\u0006\u0004\bi\u0010jJA\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00010f¢\u0006\u0004\bi\u0010kJ\u0017\u0010n\u001a\u00020\u00122\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\bn\u0010oJ\u001b\u0010q\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020l0p¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020l0p¢\u0006\u0004\bs\u0010rJ\u0017\u0010u\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u0018H\u0017¢\u0006\u0004\bu\u0010\u001bJ\u001b\u0010v\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180p¢\u0006\u0004\bv\u0010rJ\u001b\u0010w\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180p¢\u0006\u0004\bw\u0010rJ\u0017\u0010x\u001a\u00020\u00122\u0006\u0010G\u001a\u00020FH\u0015¢\u0006\u0004\bx\u0010yJ\u001b\u0010z\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020F0p¢\u0006\u0004\bz\u0010rJ\u001b\u0010{\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020F0p¢\u0006\u0004\b{\u0010rJ\u0017\u0010}\u001a\u00020\u00122\u0006\u0010|\u001a\u00020/H\u0017¢\u0006\u0004\b}\u0010~J\u001f\u0010}\u001a\u00020\u00122\u0006\u0010|\u001a\u00020/2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\b}\u0010\u007fJ\u001e\u0010\u0081\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010p¢\u0006\u0005\b\u0081\u0001\u0010rJ\u001e\u0010\u0082\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010p¢\u0006\u0005\b\u0082\u0001\u0010rJ\u001a\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020/H\u0017¢\u0006\u0005\b\u0084\u0001\u0010~J\"\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020/2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u001e\u0010\u0086\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010p¢\u0006\u0005\b\u0086\u0001\u0010rJ\u001e\u0010\u0087\u0001\u001a\u00020\u00122\r\u0010(\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010p¢\u0006\u0005\b\u0087\u0001\u0010rJ\u0011\u0010\u0088\u0001\u001a\u00020\u0012H\u0015¢\u0006\u0005\b\u0088\u0001\u0010\u000fJ\u0019\u0010\u008a\u0001\u001a\u00020\u00122\u0007\u0010(\u001a\u00030\u0089\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0019\u0010\u008c\u0001\u001a\u00020\u00122\u0007\u0010(\u001a\u00030\u0089\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008b\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u008d\u0001\u0010\u000fR\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001f\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u0012\u0005\b\u0097\u0001\u0010\u000fR\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R!\u0010£\u0001\u001a\u00030\u009e\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010`R\u0018\u0010¦\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001c\u0010¨\u0001\u001a\u00020d8\u0006¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R$\u0010\u00ad\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0p0¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R$\u0010¯\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180p0¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010®\u0001R$\u0010°\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0p0¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010®\u0001R%\u0010±\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u00010p0¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010®\u0001R%\u0010²\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010p0¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010®\u0001R\u001f\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010®\u0001R\u0019\u0010´\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0019\u0010¶\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010µ\u0001R!\u0010»\u0001\u001a\u00030·\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010 \u0001\u001a\u0006\b¹\u0001\u0010º\u0001R!\u0010À\u0001\u001a\u00030¼\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b½\u0001\u0010 \u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R!\u0010Å\u0001\u001a\u00030Á\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010 \u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010\u0016R\u0018\u0010Ë\u0001\u001a\u00030È\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Î\u0001\u001a\u00030\u0098\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ó\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0015\u0010Ú\u0001\u001a\u00030×\u00018F¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001¨\u0006ß\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/d1;", "Landroidx/lifecycle/i;", "Lj4/g;", "Lf/v;", "Lh/i;", "Lc0/d;", "Lc0/e;", "Lb0/m0;", "Lb0/n0;", "Lm0/n;", "<init>", "()V", "Landroid/os/Bundle;", "outState", "Lwj/r;", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Lg/b;", "listener", "addOnContextAvailableListener", "(Lg/b;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Lm0/r;", IronSourceConstants.EVENTS_PROVIDER, "addMenuProvider", "(Lm0/r;)V", "owner", "(Lm0/r;Landroidx/lifecycle/v;)V", "Landroidx/lifecycle/n;", "state", "(Lm0/r;Landroidx/lifecycle/v;Landroidx/lifecycle/n;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", X3.f.f27740f, "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Li/a;", "contract", "Lh/h;", "registry", "Lh/b;", "callback", "Lh/c;", "registerForActivityResult", "(Li/a;Lh/h;Lh/b;)Lh/c;", "(Li/a;Lh/b;)Lh/c;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Ll0/a;", "addOnConfigurationChangedListener", "(Ll0/a;)V", "removeOnConfigurationChangedListener", AppLovinEventTypes.USER_COMPLETED_LEVEL, "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Lb0/e;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Lb0/p0;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Lg/a;", "contextAwareHelper", "Lg/a;", "Lm0/q;", "menuHostHelper", "Lm0/q;", "Lj4/f;", "savedStateRegistryController", "Lj4/f;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/c1;", "_viewModelStore", "Landroidx/lifecycle/c1;", "Lf/h;", "reportFullyDrawnExecutor", "Lf/h;", "Lf/m;", "fullyDrawnReporter$delegate", "Lwj/d;", "getFullyDrawnReporter", "()Lf/m;", "fullyDrawnReporter", "contentLayoutId", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lh/h;", "getActivityResultRegistry", "()Lh/h;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Lx3/a;", "onBackPressedInput$delegate", "getOnBackPressedInput", "()Lx3/a;", "onBackPressedInput", "Landroidx/lifecycle/a1;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/a1;", "defaultViewModelProviderFactory", "Lf/t;", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Lf/t;", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/o;", "getLifecycle", "()Landroidx/lifecycle/o;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/c1;", "viewModelStore", "Le1/b;", "getDefaultViewModelCreationExtras", "()Le1/b;", "defaultViewModelCreationExtras", "Lx3/c;", "getNavigationEventDispatcher", "()Lx3/c;", "navigationEventDispatcher", "Lj4/e;", "getSavedStateRegistry", "()Lj4/e;", "savedStateRegistry", "Companion", "f/g", "f/i", "f/f", "activity"}, k = 1, mv = {2, 0, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements d1, i, g, v, h.i, d, e, m0, n0, n {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3834a = 0;
    private c1 _viewModelStore;
    private final h activityResultRegistry;
    private int contentLayoutId;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final wj.d defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final wj.d fullyDrawnReporter;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final wj.d onBackPressedDispatcher;

    /* JADX INFO: renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    private final wj.d onBackPressedInput;
    private final CopyOnWriteArrayList<a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<a> onNewIntentListeners;
    private final CopyOnWriteArrayList<a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final f.h reportFullyDrawnExecutor;
    private final j4.f savedStateRegistryController;
    private final g.a contextAwareHelper = new g.a();
    private final q menuHostHelper = new q(new b(this, 0));

    public ComponentActivity() {
        j4.f fVar = new j4.f(this);
        this.savedStateRegistryController = fVar;
        this.reportFullyDrawnExecutor = new f.i(this);
        this.fullyDrawnReporter = r9.b.u(new c(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new j(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = r9.b.u(new c(this, 2));
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new f.e(this, 0));
        getLifecycle().a(new f.e(this, 1));
        getLifecycle().a(new j4.b(this, 3));
        fVar.a();
        r0.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new i0(this, 3));
        addOnContextAvailableListener(new k0(this, 1));
        this.defaultViewModelProviderFactory = r9.b.u(new c(this, 3));
        this.onBackPressedDispatcher = r9.b.u(new c(this, 4));
    }

    public static void C(ComponentActivity componentActivity, androidx.lifecycle.v vVar, m mVar) {
        if (mVar == m.ON_DESTROY) {
            componentActivity.contextAwareHelper.f41333b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            f.i iVar = (f.i) componentActivity.reportFullyDrawnExecutor;
            ComponentActivity componentActivity2 = iVar.f40224d;
            componentActivity2.getWindow().getDecorView().removeCallbacks(iVar);
            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
        }
    }

    public static void D(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!kotlin.jvm.internal.n.a(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!kotlin.jvm.internal.n.a(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    public static void E(ComponentActivity componentActivity, Context it) {
        kotlin.jvm.internal.n.f(it, "it");
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            h hVar = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = hVar.f42063b;
            LinkedHashMap linkedHashMap2 = hVar.f42062a;
            Bundle bundle = hVar.f42068g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                hVar.f42065d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = stringArrayList.get(i10);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        h0.b(linkedHashMap2);
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i10);
                kotlin.jvm.internal.n.e(num2, "get(...)");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i10);
                kotlin.jvm.internal.n.e(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                hVar.f42063b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(ComponentActivity componentActivity) {
        if (componentActivity._viewModelStore == null) {
            f.g gVar = (f.g) componentActivity.getLastNonConfigurationInstance();
            if (gVar != null) {
                componentActivity._viewModelStore = gVar.f40220b;
            }
            if (componentActivity._viewModelStore == null) {
                componentActivity._viewModelStore = new c1();
            }
        }
    }

    public static Bundle g(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        h hVar = componentActivity.activityResultRegistry;
        hVar.getClass();
        LinkedHashMap linkedHashMap = hVar.f42063b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f42065d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(hVar.f42068g));
        return bundle;
    }

    public static void j(t tVar, ComponentActivity componentActivity, androidx.lifecycle.v vVar, m mVar) {
        if (mVar == m.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.n.e(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            tVar.c(onBackInvokedDispatcher);
        }
    }

    public static f.m u(ComponentActivity componentActivity) {
        return new f.m(componentActivity.reportFullyDrawnExecutor, new c(componentActivity, 0));
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        f.h hVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView, "getDecorView(...)");
        ((f.i) hVar).a(decorView);
        super.addContentView(view, params);
    }

    @Override // m0.n
    public void addMenuProvider(r provider) {
        kotlin.jvm.internal.n.f(provider, "provider");
        q qVar = this.menuHostHelper;
        qVar.f45737b.add(provider);
        qVar.f45736a.run();
    }

    @Override // c0.d
    public final void addOnConfigurationChangedListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(g.b listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        g.a aVar = this.contextAwareHelper;
        aVar.getClass();
        ComponentActivity componentActivity = aVar.f41333b;
        if (componentActivity != null) {
            listener.a(componentActivity);
        }
        aVar.f41332a.add(listener);
    }

    @Override // b0.m0
    public final void addOnMultiWindowModeChangedListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // b0.n0
    public final void addOnPictureInPictureModeChangedListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // c0.e
    public final void addOnTrimMemoryListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // h.i
    public final h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.i
    public e1.b getDefaultViewModelCreationExtras() {
        e1.c cVar = new e1.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f39019a;
        if (application != null) {
            linkedHashMap.put(y0.f4620a, getApplication());
        }
        linkedHashMap.put(r0.f4586a, this);
        linkedHashMap.put(r0.f4587b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(r0.f4588c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.i
    public a1 getDefaultViewModelProviderFactory() {
        return (a1) this.defaultViewModelProviderFactory.getValue();
    }

    public f.m getFullyDrawnReporter() {
        return (f.m) this.fullyDrawnReporter.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        f.g gVar = (f.g) getLastNonConfigurationInstance();
        if (gVar != null) {
            return gVar.f40219a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.v
    public o getLifecycle() {
        return super.getLifecycle();
    }

    public x3.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().f40248c;
    }

    @Override // f.v
    public final t getOnBackPressedDispatcher() {
        return (t) this.onBackPressedDispatcher.getValue();
    }

    @Override // j4.g
    public final j4.e getSavedStateRegistry() {
        return this.savedStateRegistryController.f43708b;
    }

    @Override // androidx.lifecycle.d1
    public c1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            f.g gVar = (f.g) getLastNonConfigurationInstance();
            if (gVar != null) {
                this._viewModelStore = gVar.f40220b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new c1();
            }
        }
        c1 c1Var = this._viewModelStore;
        kotlin.jvm.internal.n.c(c1Var);
        return c1Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.a(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ((x3.a) this.onBackPressedInput.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.n.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<a> it = this.onConfigurationChangedListeners.iterator();
        kotlin.jvm.internal.n.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        g.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f41333b = this;
        Iterator it = aVar.f41332a.iterator();
        while (it.hasNext()) {
            ((g.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = androidx.lifecycle.n0.f4570a;
        l0.b(this);
        int i11 = this.contentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        kotlin.jvm.internal.n.f(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        q qVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = qVar.f45737b.iterator();
        while (it.hasNext()) {
            ((x0) ((r) it.next())).f4504a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        kotlin.jvm.internal.n.f(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.a(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<a> it = this.onMultiWindowModeChangedListeners.iterator();
        kotlin.jvm.internal.n.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new b0.e(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.n.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator<a> it = this.onNewIntentListeners.iterator();
        kotlin.jvm.internal.n.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        kotlin.jvm.internal.n.f(menu, "menu");
        Iterator it = this.menuHostHelper.f45737b.iterator();
        while (it.hasNext()) {
            ((x0) ((r) it.next())).f4504a.q(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<a> it = this.onPictureInPictureModeChangedListeners.iterator();
        kotlin.jvm.internal.n.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new p0(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        kotlin.jvm.internal.n.f(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        Iterator it = this.menuHostHelper.f45737b.iterator();
        while (it.hasNext()) {
            ((x0) ((r) it.next())).f4504a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.n.f(permissions, "permissions");
        kotlin.jvm.internal.n.f(grantResults, "grantResults");
        if (this.activityResultRegistry.a(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        f.g gVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        c1 c1Var = this._viewModelStore;
        if (c1Var == null && (gVar = (f.g) getLastNonConfigurationInstance()) != null) {
            c1Var = gVar.f40220b;
        }
        if (c1Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        f.g gVar2 = new f.g();
        gVar2.f40219a = objOnRetainCustomNonConfigurationInstance;
        gVar2.f40220b = c1Var;
        return gVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.n.f(outState, "outState");
        if (getLifecycle() instanceof x) {
            o lifecycle = getLifecycle();
            kotlin.jvm.internal.n.d(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((x) lifecycle).g();
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<a> it = this.onTrimMemoryListeners.iterator();
        kotlin.jvm.internal.n.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        kotlin.jvm.internal.n.e(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f41333b;
    }

    public final <I, O> h.c registerForActivityResult(i.a contract, h registry, h.b callback) {
        kotlin.jvm.internal.n.f(contract, "contract");
        kotlin.jvm.internal.n.f(registry, "registry");
        kotlin.jvm.internal.n.f(callback, "callback");
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // m0.n
    public void removeMenuProvider(r provider) {
        kotlin.jvm.internal.n.f(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    @Override // c0.d
    public final void removeOnConfigurationChangedListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(g.b listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        g.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f41332a.remove(listener);
    }

    @Override // b0.m0
    public final void removeOnMultiWindowModeChangedListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // b0.n0
    public final void removeOnPictureInPictureModeChangedListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // c0.e
    public final void removeOnTrimMemoryListener(a listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (n4.a.a()) {
                Trace.beginSection(com.google.android.gms.internal.auth.o.z("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            f.m fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f40233b) {
                try {
                    fullyDrawnReporter.f40234c = true;
                    Iterator it = fullyDrawnReporter.f40235d.iterator();
                    while (it.hasNext()) {
                        ((jk.a) it.next()).invoke();
                    }
                    fullyDrawnReporter.f40235d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        f.h hVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView, "getDecorView(...)");
        ((f.i) hVar).a(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode) {
        kotlin.jvm.internal.n.f(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.n.f(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        kotlin.jvm.internal.n.f(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.n.f(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public final <I, O> h.c registerForActivityResult(i.a contract, h.b callback) {
        kotlin.jvm.internal.n.f(contract, "contract");
        kotlin.jvm.internal.n.f(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        kotlin.jvm.internal.n.f(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<a> it = this.onMultiWindowModeChangedListeners.iterator();
            kotlin.jvm.internal.n.e(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new b0.e(isInMultiWindowMode));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        kotlin.jvm.internal.n.f(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<a> it = this.onPictureInPictureModeChangedListeners.iterator();
            kotlin.jvm.internal.n.e(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new p0(isInPictureInPictureMode));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        f.h hVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView, "getDecorView(...)");
        ((f.i) hVar).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(r provider, androidx.lifecycle.v owner) {
        kotlin.jvm.internal.n.f(provider, "provider");
        kotlin.jvm.internal.n.f(owner, "owner");
        q qVar = this.menuHostHelper;
        qVar.f45737b.add(provider);
        qVar.f45736a.run();
        o lifecycle = owner.getLifecycle();
        HashMap map = qVar.f45738c;
        p pVar = (p) map.remove(provider);
        if (pVar != null) {
            pVar.f45734a.b(pVar.f45735b);
            pVar.f45735b = null;
        }
        map.put(provider, new p(lifecycle, new f.d(1, qVar, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        f.h hVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.e(decorView, "getDecorView(...)");
        ((f.i) hVar).a(decorView);
        super.setContentView(view, params);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final r provider, androidx.lifecycle.v owner, final androidx.lifecycle.n state) {
        kotlin.jvm.internal.n.f(provider, "provider");
        kotlin.jvm.internal.n.f(owner, "owner");
        kotlin.jvm.internal.n.f(state, "state");
        final q qVar = this.menuHostHelper;
        qVar.getClass();
        o lifecycle = owner.getLifecycle();
        HashMap map = qVar.f45738c;
        p pVar = (p) map.remove(provider);
        if (pVar != null) {
            pVar.f45734a.b(pVar.f45735b);
            pVar.f45735b = null;
        }
        map.put(provider, new p(lifecycle, new androidx.lifecycle.t() { // from class: m0.o
            @Override // androidx.lifecycle.t
            public final void onStateChanged(androidx.lifecycle.v vVar, androidx.lifecycle.m mVar) {
                androidx.lifecycle.m mVar2;
                q qVar2 = qVar;
                qVar2.getClass();
                Runnable runnable = qVar2.f45736a;
                CopyOnWriteArrayList copyOnWriteArrayList = qVar2.f45737b;
                androidx.lifecycle.m.Companion.getClass();
                androidx.lifecycle.n nVar = state;
                int iOrdinal = nVar.ordinal();
                androidx.lifecycle.m mVar3 = null;
                if (iOrdinal == 2) {
                    mVar2 = androidx.lifecycle.m.ON_CREATE;
                } else if (iOrdinal != 3) {
                    mVar2 = iOrdinal != 4 ? null : androidx.lifecycle.m.ON_RESUME;
                } else {
                    mVar2 = androidx.lifecycle.m.ON_START;
                }
                r rVar = provider;
                if (mVar == mVar2) {
                    copyOnWriteArrayList.add(rVar);
                    runnable.run();
                    return;
                }
                androidx.lifecycle.m mVar4 = androidx.lifecycle.m.ON_DESTROY;
                if (mVar == mVar4) {
                    qVar2.b(rVar);
                    return;
                }
                int iOrdinal2 = nVar.ordinal();
                if (iOrdinal2 == 2) {
                    mVar3 = mVar4;
                } else if (iOrdinal2 == 3) {
                    mVar3 = androidx.lifecycle.m.ON_STOP;
                } else if (iOrdinal2 == 4) {
                    mVar3 = androidx.lifecycle.m.ON_PAUSE;
                }
                if (mVar == mVar3) {
                    copyOnWriteArrayList.remove(rVar);
                    runnable.run();
                }
            }
        }));
    }
}
