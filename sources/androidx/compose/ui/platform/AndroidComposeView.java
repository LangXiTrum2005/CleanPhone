package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.runtime.liable;
import androidx.compose.runtime.miliaria;
import androidx.compose.runtime.tout;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import androidx.p001lifecycle.C0828overspeculate;
import androidx.p001lifecycle.Lifecycle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Ie;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference0Impl;
import starveling.PointerInputEventData;
import walach.RotaryScrollEvent;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0098\u0004\b\u0000\u0018\u0000 Ï\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u0099\u0001Ð\u0004B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010&\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0#H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020\u001c2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u000e*\u00020+H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001cH\u0002¢\u0006\u0004\b1\u0010\u001eJ%\u00105\u001a\u0002042\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u0002042\u0006\u00107\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001cH\u0002¢\u0006\u0004\b:\u0010\u001eJ\u0017\u0010<\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020+H\u0002¢\u0006\u0004\b<\u0010.J\u0017\u0010=\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020+H\u0002¢\u0006\u0004\b=\u0010.J\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020>H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020>2\u0006\u0010F\u001a\u00020>H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bI\u0010AJ\u001d\u0010J\u001a\u00020C2\u0006\u0010B\u001a\u00020>H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010EJ1\u0010O\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020>2\u0006\u0010K\u001a\u00020\u00142\u0006\u0010M\u001a\u00020L2\b\b\u0002\u0010N\u001a\u00020\u000eH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020>H\u0002¢\u0006\u0004\bQ\u0010AJ\u000f\u0010R\u001a\u00020\u001cH\u0002¢\u0006\u0004\bR\u0010\u001eJ\u0017\u0010S\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020>H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u001cH\u0002¢\u0006\u0004\bU\u0010\u001eJ\u000f\u0010V\u001a\u00020\u000eH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bX\u0010AJ\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bY\u0010AJ!\u0010\\\u001a\u0004\u0018\u00010\u00162\u0006\u0010Z\u001a\u00020\u00142\u0006\u0010[\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u00020\u001c2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bd\u0010eJ-\u0010l\u001a\u00020\u001c2\u0006\u0010f\u001a\u00020^2\u0006\u0010h\u001a\u00020g2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020j0iH\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020\u001c2\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ#\u0010s\u001a\u0004\u0018\u00010\u00162\b\u0010r\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\bs\u0010tJ!\u0010u\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010^H\u0016¢\u0006\u0004\bu\u0010vJ)\u0010x\u001a\u00020\u001c2\u0006\u0010w\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010^H\u0014¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u001c2\u0006\u0010z\u001a\u00020\u000eH\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020}H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u0019\u0010\u0080\u0001\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020}H\u0016¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u001b\u0010\u0082\u0001\u001a\u00020\u001c2\u0007\u0010\u0081\u0001\u001a\u00020LH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020+H\u0016¢\u0006\u0005\b\u0084\u0001\u0010.J\u0019\u0010\u0085\u0001\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020+H\u0016¢\u0006\u0005\b\u0085\u0001\u0010.J\u000f\u0010\u0086\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0086\u0001\u0010\u001eJ\u0011\u0010\u0087\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u0087\u0001\u0010\u001eJ\"\u0010\u008a\u0001\u001a\u00020\u001c2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0\u0088\u0001H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001d\u0010\u008d\u0001\u001a\u00020\u001c2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J&\u0010\u008d\u0001\u001a\u00020\u001c2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u008f\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u0090\u0001J/\u0010\u008d\u0001\u001a\u00020\u001c2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u0091\u0001\u001a\u00020\u00142\u0007\u0010\u0092\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u0093\u0001J)\u0010\u008d\u0001\u001a\u00020\u001c2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00162\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u0096\u0001J2\u0010\u008d\u0001\u001a\u00020\u001c2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u008f\u0001\u001a\u00020\u00142\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u0097\u0001J\u001a\u0010\u0099\u0001\u001a\u00020\u001c2\u0007\u0010\u0098\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0099\u0001\u0010|J$\u0010\u009c\u0001\u001a\u00020\u001c2\u0007\u0010\u009a\u0001\u001a\u00020+2\u0007\u0010\u009b\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J6\u0010 \u0001\u001a\u00020\u001c2\u0007\u0010\u009a\u0001\u001a\u00020+2\u0007\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u009e\u0001\u001a\u00020\u000e2\u0007\u0010\u009f\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b \u0001\u0010¡\u0001J-\u0010¢\u0001\u001a\u00020\u001c2\u0007\u0010\u009a\u0001\u001a\u00020+2\u0007\u0010\u009b\u0001\u001a\u00020\u000e2\u0007\u0010\u009e\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001a\u0010¤\u0001\u001a\u00020\u001c2\u0007\u0010\u009a\u0001\u001a\u00020+H\u0016¢\u0006\u0005\b¤\u0001\u0010.J$\u0010§\u0001\u001a\u00020\u001c2\u0007\u0010¥\u0001\u001a\u00020\u00142\u0007\u0010¦\u0001\u001a\u00020\u0014H\u0014¢\u0006\u0006\b§\u0001\u0010¨\u0001J>\u0010\u00ad\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u00020\u000e2\u0007\u0010ª\u0001\u001a\u00020\u00142\u0007\u0010«\u0001\u001a\u00020\u00142\u0007\u0010¬\u0001\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0014H\u0014¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001c\u0010±\u0001\u001a\u00020\u001c2\b\u0010°\u0001\u001a\u00030¯\u0001H\u0014¢\u0006\u0006\b±\u0001\u0010²\u0001JO\u0010º\u0001\u001a\u00030¹\u00012\u001e\u0010¶\u0001\u001a\u0019\u0012\u0005\u0012\u00030´\u0001\u0012\u0007\u0012\u0005\u0018\u00010µ\u0001\u0012\u0004\u0012\u00020\u001c0³\u00012\u000e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0\u0088\u00012\n\u0010¸\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0016¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001c\u0010½\u0001\u001a\u00020\u000e2\b\u0010¼\u0001\u001a\u00030¹\u0001H\u0000¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0011\u0010¿\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\b¿\u0001\u0010\u001eJ\u001a\u0010À\u0001\u001a\u00020\u001c2\u0007\u0010\u009a\u0001\u001a\u00020+H\u0016¢\u0006\u0005\bÀ\u0001\u0010.J\u001c\u0010Â\u0001\u001a\u00020\u001c2\b\u0010\u0089\u0001\u001a\u00030Á\u0001H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J!\u0010Æ\u0001\u001a\u0004\u0018\u00010\f2\b\u0010Å\u0001\u001a\u00030Ä\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u001c\u0010È\u0001\u001a\u00020\u001c2\b\u0010°\u0001\u001a\u00030¯\u0001H\u0014¢\u0006\u0006\bÈ\u0001\u0010²\u0001J%\u0010Ê\u0001\u001a\u00020\u001c2\b\u0010¼\u0001\u001a\u00030¹\u00012\u0007\u0010É\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J&\u0010Î\u0001\u001a\u00020\u001c2\u0014\u0010Í\u0001\u001a\u000f\u0012\u0005\u0012\u00030Ì\u0001\u0012\u0004\u0012\u00020\u001c0#¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0013\u0010Ð\u0001\u001a\u00020\u001cH\u0086@¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u0013\u0010Ò\u0001\u001a\u00020\u001cH\u0086@¢\u0006\u0006\bÒ\u0001\u0010Ñ\u0001J\u0011\u0010Ó\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\bÓ\u0001\u0010\u001eJ\u0011\u0010Ô\u0001\u001a\u00020\u001cH\u0014¢\u0006\u0005\bÔ\u0001\u0010\u001eJ\u0011\u0010Õ\u0001\u001a\u00020\u001cH\u0014¢\u0006\u0005\bÕ\u0001\u0010\u001eJ%\u0010×\u0001\u001a\u00020\u001c2\b\u0010c\u001a\u0004\u0018\u00010b2\u0007\u0010Ö\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b×\u0001\u0010Ø\u0001J#\u0010Ü\u0001\u001a\u00020\u001c2\u000f\u0010Û\u0001\u001a\n\u0012\u0005\u0012\u00030Ú\u00010Ù\u0001H\u0016¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J8\u0010ä\u0001\u001a\u00020\u001c2\b\u0010ß\u0001\u001a\u00030Þ\u00012\b\u0010á\u0001\u001a\u00030à\u00012\u0010\u0010ã\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010â\u00010iH\u0017¢\u0006\u0006\bä\u0001\u0010å\u0001J%\u0010é\u0001\u001a\u00020\u001c2\u0011\u0010è\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ç\u00010æ\u0001H\u0017¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u0019\u0010ë\u0001\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020>H\u0016¢\u0006\u0005\bë\u0001\u0010AJ\u0019\u0010ì\u0001\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020>H\u0016¢\u0006\u0005\bì\u0001\u0010AJ\u0019\u0010í\u0001\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0005\bí\u0001\u0010\u0010J\u0019\u0010î\u0001\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0005\bî\u0001\u0010\u0010J \u0010ñ\u0001\u001a\u00030ï\u00012\b\u0010ð\u0001\u001a\u00030ï\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\u001f\u0010õ\u0001\u001a\u00020\u001c2\b\u0010ô\u0001\u001a\u00030ó\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bõ\u0001\u0010ö\u0001J \u0010ø\u0001\u001a\u00030ï\u00012\b\u0010÷\u0001\u001a\u00030ï\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010ò\u0001J\u0011\u0010ù\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\bù\u0001\u0010WJ\u001f\u0010ý\u0001\u001a\u0005\u0018\u00010ü\u00012\b\u0010û\u0001\u001a\u00030ú\u0001H\u0016¢\u0006\u0006\bý\u0001\u0010þ\u0001J \u0010ÿ\u0001\u001a\u00030ï\u00012\b\u0010ð\u0001\u001a\u00030ï\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÿ\u0001\u0010ò\u0001J\u001c\u0010\u0082\u0002\u001a\u00020\u001c2\b\u0010\u0081\u0002\u001a\u00030\u0080\u0002H\u0014¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J\u001b\u0010\u0085\u0002\u001a\u00020\u001c2\u0007\u0010\u0084\u0002\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u0019\u0010\u0087\u0002\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0005\b\u0087\u0002\u0010AJ\u0019\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00162\u0006\u0010Z\u001a\u00020\u0014¢\u0006\u0005\b\u0088\u0002\u0010\u0018J\u0011\u0010\u0089\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0089\u0002\u0010WR \u0010\u008b\u0002\u001a\u00030ï\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bº\u0001\u0010\u008a\u0002R\u0019\u0010\u008d\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u008c\u0002R\u001f\u0010\u0092\u0002\u001a\u00030\u008e\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bp\u0010\u008f\u0002\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R5\u0010\u009a\u0002\u001a\u00030\u0093\u00022\b\u0010\u0094\u0002\u001a\u00030\u0093\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b \u0001\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002\"\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0018\u0010\u009d\u0002\u001a\u00030\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u009c\u0002R\u0018\u0010 \u0002\u001a\u00030\u009e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010\u009f\u0002R \u0010¥\u0002\u001a\u00030¡\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002R\u0018\u0010©\u0002\u001a\u00030¦\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R1\u0010\t\u001a\u00020\b2\u0007\u0010ª\u0002\u001a\u00020\b8\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010«\u0002\u001a\u0006\b¬\u0002\u0010\u00ad\u0002\"\u0006\b®\u0002\u0010¯\u0002R \u0010´\u0002\u001a\u00030°\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¿\u0001\u0010±\u0002\u001a\u0006\b²\u0002\u0010³\u0002R\u0018\u0010¸\u0002\u001a\u00030µ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R\u0018\u0010¼\u0002\u001a\u00030¹\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u0018\u0010¾\u0002\u001a\u00030¹\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010»\u0002R\u0018\u0010Â\u0002\u001a\u00030¿\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u001f\u0010Ç\u0002\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÃ\u0002\u0010Ä\u0002\u001a\u0006\bÅ\u0002\u0010Æ\u0002R \u0010Í\u0002\u001a\u00030È\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÉ\u0002\u0010Ê\u0002\u001a\u0006\bË\u0002\u0010Ì\u0002R \u0010Ó\u0002\u001a\u00030Î\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÏ\u0002\u0010Ð\u0002\u001a\u0006\bÑ\u0002\u0010Ò\u0002R\u0018\u0010×\u0002\u001a\u00030Ô\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0002\u0010Ö\u0002R*\u0010ß\u0002\u001a\u00030Ø\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÙ\u0002\u0010Ú\u0002\u001a\u0006\bÛ\u0002\u0010Ü\u0002\"\u0006\bÝ\u0002\u0010Þ\u0002R \u0010å\u0002\u001a\u00030à\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bá\u0002\u0010â\u0002\u001a\u0006\bã\u0002\u0010ä\u0002R \u0010ë\u0002\u001a\u00030æ\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bç\u0002\u0010è\u0002\u001a\u0006\bé\u0002\u0010ê\u0002R \u0010ñ\u0002\u001a\u00030ì\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bí\u0002\u0010î\u0002\u001a\u0006\bï\u0002\u0010ð\u0002R\u001f\u0010õ\u0002\u001a\n\u0012\u0005\u0012\u00030¹\u00010ò\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0002\u0010ô\u0002R#\u0010÷\u0002\u001a\f\u0012\u0005\u0012\u00030¹\u0001\u0018\u00010ò\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0002\u0010ô\u0002R\u0019\u0010ù\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0002\u0010\u008c\u0002R\u0019\u0010û\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0002\u0010\u008c\u0002R\u0018\u0010ÿ\u0002\u001a\u00030ü\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0002\u0010þ\u0002R\u0018\u0010\u0083\u0003\u001a\u00030\u0080\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0003\u0010\u0082\u0003R6\u0010\u0089\u0003\u001a\u000f\u0012\u0005\u0012\u00030\u0080\u0002\u0012\u0004\u0012\u00020\u001c0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0003\u0010\u0085\u0003\u001a\u0006\b\u0086\u0003\u0010\u0087\u0003\"\u0006\b\u0088\u0003\u0010Ï\u0001R\u001a\u0010\u008d\u0003\u001a\u0005\u0018\u00010\u008a\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0003\u0010\u008c\u0003R\u0019\u0010\u008f\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0003\u0010\u008c\u0002R \u0010\u0095\u0003\u001a\u00030\u0090\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0003\u0010\u0092\u0003\u001a\u0006\b\u0093\u0003\u0010\u0094\u0003R \u0010\u009b\u0003\u001a\u00030\u0096\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0003\u0010\u0098\u0003\u001a\u0006\b\u0099\u0003\u0010\u009a\u0003R-\u0010\u009f\u0003\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u001c\n\u0005\bV\u0010\u008c\u0002\u0012\u0005\b\u009e\u0003\u0010\u001e\u001a\u0005\b\u009c\u0003\u0010W\"\u0005\b\u009d\u0003\u0010|R\u001c\u0010¢\u0003\u001a\u0005\u0018\u00010 \u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010¡\u0003R\u001c\u0010¥\u0003\u001a\u0005\u0018\u00010£\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010¤\u0003R!\u0010¨\u0003\u001a\u0005\u0018\u00010¦\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b/\u0010§\u0003R\u0018\u0010©\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010\u008c\u0002R\u0017\u0010¬\u0003\u001a\u00030ª\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010«\u0003R\u001f\u0010±\u0003\u001a\u00030\u00ad\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b1\u0010®\u0003\u001a\u0006\b¯\u0003\u0010°\u0003R\u001f\u0010³\u0003\u001a\u00030²\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0017\u0010\u008a\u0002R\u0017\u0010µ\u0003\u001a\u00030à\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010´\u0003R\u001e\u0010·\u0003\u001a\u00030ó\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÆ\u0001\u0010¶\u0003R\u001e\u0010¹\u0003\u001a\u00030ó\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b¸\u0003\u0010¶\u0003R\u001e\u0010»\u0003\u001a\u00030ó\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bº\u0003\u0010¶\u0003R/\u0010À\u0003\u001a\u00020L8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\bD\u0010\u008a\u0002\u0012\u0005\b¿\u0003\u0010\u001e\u001a\u0006\b¼\u0003\u0010½\u0003\"\u0006\b¾\u0003\u0010\u0083\u0001R\u0018\u0010Á\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u008c\u0002R\u001f\u0010Â\u0003\u001a\u00030ï\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bG\u0010\u008a\u0002R\u0019\u0010Ã\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010\u008c\u0002R8\u0010È\u0003\u001a\u0005\u0018\u00010Ì\u00012\n\u0010\u0094\u0002\u001a\u0005\u0018\u00010Ì\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b=\u0010\u0095\u0002\u001a\u0006\bÄ\u0003\u0010Å\u0003\"\u0006\bÆ\u0003\u0010Ç\u0003R\"\u0010Ë\u0003\u001a\u0005\u0018\u00010Ì\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b<\u0010É\u0003\u001a\u0006\bÊ\u0003\u0010Å\u0003R'\u0010Ì\u0003\u001a\u0011\u0012\u0005\u0012\u00030Ì\u0001\u0012\u0004\u0012\u00020\u001c\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010\u0085\u0003R\u0017\u0010Ï\u0003\u001a\u00030Í\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010Î\u0003R\u0017\u0010Ò\u0003\u001a\u00030Ð\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bQ\u0010Ñ\u0003R\u0017\u0010Õ\u0003\u001a\u00030Ó\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bY\u0010Ô\u0003R\u0018\u0010Ø\u0003\u001a\u00030Ö\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010×\u0003R\u001f\u0010Ý\u0003\u001a\u00030Ù\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u001d\u0010Ú\u0003\u001a\u0006\bÛ\u0003\u0010Ü\u0003R$\u0010á\u0003\u001a\n\u0012\u0005\u0012\u00030ß\u00030Þ\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0012\u0010à\u0003R\u001f\u0010æ\u0003\u001a\u00030â\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u000f\u0010ã\u0003\u001a\u0006\bä\u0003\u0010å\u0003R&\u0010ì\u0003\u001a\u00030ç\u00038\u0016X\u0097\u0004¢\u0006\u0016\n\u0005\b\u001a\u0010è\u0003\u0012\u0005\bë\u0003\u0010\u001e\u001a\u0006\bé\u0003\u0010ê\u0003R4\u0010ò\u0003\u001a\u00030í\u00032\b\u0010\u0094\u0002\u001a\u00030í\u00038V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b5\u0010\u0095\u0002\u001a\u0006\bî\u0003\u0010ï\u0003\"\u0006\bð\u0003\u0010ñ\u0003R\u0018\u0010ô\u0003\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010ó\u0003R4\u0010\u0084\u0002\u001a\u00030õ\u00032\b\u0010\u0094\u0002\u001a\u00030õ\u00038V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bS\u0010\u0095\u0002\u001a\u0006\bö\u0003\u0010÷\u0003\"\u0006\bø\u0003\u0010ù\u0003R\u001f\u0010þ\u0003\u001a\u00030ú\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bU\u0010û\u0003\u001a\u0006\bü\u0003\u0010ý\u0003R\u0018\u0010\u0081\u0004\u001a\u00030ÿ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010\u0080\u0004R \u0010\u0086\u0004\u001a\u00030\u0082\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0083\u0004\u001a\u0006\b\u0084\u0004\u0010\u0085\u0004R\u001f\u0010\u008b\u0004\u001a\u00030\u0087\u00048\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b-\u0010\u0088\u0004\u001a\u0006\b\u0089\u0004\u0010\u008a\u0004R\u001b\u0010\u008e\u0004\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0004\u0010\u008d\u0004R\u0019\u0010\u0090\u0004\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0004\u0010\u008a\u0002R\u001f\u0010\u0094\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00010\u0091\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0004\u0010\u0093\u0004R&\u0010\u0097\u0004\u001a\u0012\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0088\u00010\u0095\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010\u0096\u0004R\u0017\u0010\u009a\u0004\u001a\u00030\u0098\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010\u0099\u0004R\u0018\u0010\u009e\u0004\u001a\u00030\u009b\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0004\u0010\u009d\u0004R\u0018\u0010\u009f\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u008c\u0002R\u001e\u0010¢\u0004\u001a\t\u0012\u0004\u0012\u00020\u001c0\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0004\u0010¡\u0004R\u0017\u0010¥\u0004\u001a\u00030£\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010¤\u0004R\u0019\u0010§\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0004\u0010\u008c\u0002R\u001a\u0010«\u0004\u001a\u0005\u0018\u00010¨\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0004\u0010ª\u0004R \u0010±\u0004\u001a\u00030¬\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0004\u0010®\u0004\u001a\u0006\b¯\u0004\u0010°\u0004R\u001c\u0010³\u0004\u001a\u00020\u0014*\u00030\u0080\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¸\u0003\u0010²\u0004R\u0017\u0010¶\u0004\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0004\u0010µ\u0004R\u0018\u0010º\u0004\u001a\u00030·\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b¸\u0004\u0010¹\u0004R\u001a\u0010Ü\u0001\u001a\u0005\u0018\u00010»\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0004\u0010½\u0004R\u0018\u0010À\u0004\u001a\u00030 \u00038@X\u0080\u0004¢\u0006\b\u001a\u0006\b¾\u0004\u0010¿\u0004R\u0017\u0010Â\u0004\u001a\u00020L8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0004\u0010½\u0003R\u0016\u0010Ä\u0004\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0004\u0010WR\u0018\u0010È\u0004\u001a\u00030Å\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0004\u0010Ç\u0004R\u0018\u0010Ì\u0004\u001a\u00030É\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0004\u0010Ë\u0004R\u0016\u0010Î\u0004\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0004\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ñ\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/peridotite;", "Landroidx/compose/ui/platform/mastfed;", "Lstarveling/yemenite;", "Landroidx/lifecycle/marial;", "Landroid/content/Context;", "context", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/ui/focus/saneness;", "focusDirection", "", "picketboat", "(I)Z", "Lsupplicat/taiyuan;", "gusty", "()Lsupplicat/taiyuan;", "", "direction", "Landroid/view/View;", "timberyard", "(I)Landroid/view/View;", "previouslyFocusedRect", "palmyra", "(Landroidx/compose/ui/focus/saneness;Lsupplicat/taiyuan;)Z", "", "igbo", "()V", "Landroidx/compose/ui/draganddrop/competently;", "transferData", "Lsupplicat/impassible;", "decorationSize", "Lkotlin/Function1;", "Lmerc/beachfront;", "drawDragDecoration", "mastfed", "(Landroidx/compose/ui/draganddrop/competently;JLkotlin/jvm/functions/Function1;)Z", "viewGroup", "permissivist", "(Landroid/view/ViewGroup;)V", "Landroidx/compose/ui/node/LayoutNode;", "nodeToRemeasure", "hardpan", "(Landroidx/compose/ui/node/LayoutNode;)V", "dent", "(Landroidx/compose/ui/node/LayoutNode;)Z", "premeiotic", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lpatroclinal/monoploid;", "lightstruck", "(II)J", "measureSpec", "cultivated", "(I)J", "homozygous", "node", "coi", "empress", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "nosophobia", "(Landroid/view/MotionEvent;)Z", "motionEvent", "Lstarveling/sealless;", "lerp", "(Landroid/view/MotionEvent;)I", "lastEvent", "lotta", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", "sensatory", "dhss", "action", "", "eventTime", "forceHover", "vesuvio", "(Landroid/view/MotionEvent;IJZ)V", "underbelly", "monroe", "julian", "(Landroid/view/MotionEvent;)V", "achondroplasia", "splinterproof", "()Z", "czestochowa", "preterite", "accessibilityId", "currentView", "milliradian", "(ILandroid/view/View;)Landroid/view/View;", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "localVisibleRect", "Landroid/graphics/Point;", "windowOffset", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "onScrollCaptureSearch", "(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V", "Landroidx/lifecycle/arytenoidectomy;", "owner", "monoploid", "(Landroidx/lifecycle/arytenoidectomy;)V", "focused", "focusSearch", "(Landroid/view/View;I)Landroid/view/View;", "requestFocus", "(ILandroid/graphics/Rect;)Z", "gainFocus", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEventPreIme", "intervalMillis", "setAccessibilityEventBatchIntervalMillis", "(J)V", "arytenoidectomy", "molybdenite", "claque", "gintrap", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "adultoid", "(Lkotlin/jvm/functions/Function0;)V", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "sendPointerUpdate", "attabal", "layoutNode", "affectsLookahead", "taiyuan", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "forceRequest", "scheduleMeasureAndLayout", "polloi", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "wireman", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "competently", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkotlin/Function2;", "Lrestrictive/creditor;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlock", "invalidateParentLayer", "explicitLayer", "Landroidx/compose/ui/node/walach;", "kowloon", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Landroidx/compose/ui/node/walach;", "layer", "unconsolidated", "(Landroidx/compose/ui/node/walach;)Z", "rotuma", "impromptu", "Landroidx/compose/ui/node/peridotite$saneness;", "impassible", "(Landroidx/compose/ui/node/peridotite$saneness;)V", "Lprivatdozent/saneness;", "keyEvent", "treadless", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/saneness;", "dispatchDraw", "isDirty", "wostteth", "(Landroidx/compose/ui/node/walach;Z)V", "Landroidx/compose/ui/platform/AndroidComposeView$saneness;", "callback", "setOnViewTreeOwnersAvailable", "(Lkotlin/jvm/functions/Function1;)V", "clubfoot", "(Lwretchedly/dern;)Ljava/lang/Object;", "overspeculate", "sayid", "onAttachedToWindow", "onDetachedFromWindow", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "(Landroid/util/SparseArray;)V", "", "virtualIds", "", "supportedFormats", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "([J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", Ie.n, "onVirtualViewTranslationResponses", "(Landroid/util/LongSparseArray;)V", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Lsupplicat/competently;", "localPosition", "graveside", "(J)J", "Lrestrictive/lerp;", "localTransform", "apical", "([F)V", "positionOnScreen", "triweekly", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "beachfront", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "J", "lastDownPointerPosition", "Z", "superclassInitComplete", "Landroidx/compose/ui/node/cord;", "Landroidx/compose/ui/node/cord;", "getSharedDrawScope", "()Landroidx/compose/ui/node/cord;", "sharedDrawScope", "Lmilliradian/wireman;", "<set-?>", "Landroidx/compose/runtime/czestochowa;", "getDensity", "()Lmilliradian/wireman;", "setDensity", "(Lmilliradian/wireman;)V", "density", "Landroidx/compose/ui/semantics/marial;", "Landroidx/compose/ui/semantics/marial;", "rootSemanticsNode", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsModifier", "Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "dovishness", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "dragAndDropModifierOnDragListener", "value", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/ui/draganddrop/dern;", "Landroidx/compose/ui/draganddrop/dern;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/dern;", "dragAndDropManager", "Landroidx/compose/ui/platform/lampshade;", "preprohormone", "Landroidx/compose/ui/platform/lampshade;", "_windowInfo", "Landroidx/compose/ui/attabal;", "cord", "Landroidx/compose/ui/attabal;", "keyInputModifier", "cuirassed", "rotaryInputModifier", "Lrestrictive/starveling;", "stratoscope", "Lrestrictive/starveling;", "canvasHolder", "trm", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/cultivated;", "oilcan", "Landroidx/compose/ui/node/cultivated;", "getRootForTest", "()Landroidx/compose/ui/node/cultivated;", "rootForTest", "Landroidx/compose/ui/semantics/kowloon;", "yemenite", "Landroidx/compose/ui/semantics/kowloon;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/kowloon;", "semanticsOwner", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "sealless", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "composeAccessibilityDelegate", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "kattegat", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "getContentCaptureManager$ui_release", "()Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "setContentCaptureManager$ui_release", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;)V", "contentCaptureManager", "Landroidx/compose/ui/platform/taiyuan;", "supplicat", "Landroidx/compose/ui/platform/taiyuan;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/taiyuan;", "accessibilityManager", "Lrestrictive/milliradian;", "restrictive", "Lrestrictive/milliradian;", "getGraphicsContext", "()Lrestrictive/milliradian;", "graphicsContext", "Lsealless/preprohormone;", "merc", "Lsealless/preprohormone;", "getAutofillTree", "()Lsealless/preprohormone;", "autofillTree", "", "polder", "Ljava/util/List;", "dirtyLayers", "seminary", "postponedDirtyLayers", "grimness", "isDrawingContent", "saran", "isPendingInteropViewLayoutChangeDispatch", "Lstarveling/beachfront;", "privatdozent", "Lstarveling/beachfront;", "motionEventAdapter", "Lstarveling/preprohormone;", "creditor", "Lstarveling/preprohormone;", "pointerInputEventProcessor", "starveling", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "configurationChangeObserver", "Lsealless/wireman;", "hydrovane", "Lsealless/wireman;", "_autofill", "walach", "observationClearRequested", "Landroidx/compose/ui/platform/cutely;", "peridotite", "Landroidx/compose/ui/platform/cutely;", "getClipboardManager", "()Landroidx/compose/ui/platform/cutely;", "clipboardManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "mathsort", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/DrawChildContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "Lmilliradian/saneness;", "Lmilliradian/saneness;", "onMeasureConstraints", "wasMeasuredWithMultipleConstraints", "Landroidx/compose/ui/node/sealless;", "Landroidx/compose/ui/node/sealless;", "measureAndLayoutDelegate", "Landroidx/compose/ui/platform/outmarry;", "Landroidx/compose/ui/platform/outmarry;", "getViewConfiguration", "()Landroidx/compose/ui/platform/outmarry;", "viewConfiguration", "Lmilliradian/impassible;", "globalPosition", "[I", "tmpPositionArray", "[F", "tmpMatrix", "itchy", "viewToWindowMatrix", "coffeecake", "windowToViewMatrix", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "forceUseMatrixCache", "windowPosition", "isRenderNodeCompatible", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$saneness;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$saneness;)V", "_viewTreeOwners", "Landroidx/compose/runtime/tout;", "getViewTreeOwners", "viewTreeOwners", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "legacyTextInputServiceAndroid", "Landroidx/compose/ui/text/input/oilcan;", "Landroidx/compose/ui/text/input/oilcan;", "getTextInputService", "()Landroidx/compose/ui/text/input/oilcan;", "textInputService", "Lyemenite/beachfront;", "Landroidx/compose/ui/platform/merc;", "Ljava/util/concurrent/atomic/AtomicReference;", "textInputSessionMutex", "Landroidx/compose/ui/platform/unconsolidated;", "Landroidx/compose/ui/platform/unconsolidated;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/unconsolidated;", "softwareKeyboardController", "Landroidx/compose/ui/text/font/impromptu$saneness;", "Landroidx/compose/ui/text/font/impromptu$saneness;", "getFontLoader", "()Landroidx/compose/ui/text/font/impromptu$saneness;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/taiyuan$saneness;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/taiyuan$saneness;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/taiyuan$saneness;)V", "fontFamilyResolver", "I", "currentFontWeightAdjustment", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Lgrimness/attabal;", "Lgrimness/attabal;", "getHapticFeedBack", "()Lgrimness/attabal;", "hapticFeedBack", "Lsaran/dern;", "Lsaran/dern;", "_inputModeManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/platform/claque;", "Landroidx/compose/ui/platform/claque;", "getTextToolbar", "()Landroidx/compose/ui/platform/claque;", "textToolbar", "herdbook", "Landroid/view/MotionEvent;", "previousMotionEvent", "technofreak", "relayoutTime", "Landroidx/compose/ui/platform/attendance;", "outmarry", "Landroidx/compose/ui/platform/attendance;", "layerCache", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/runtime/collection/dern;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$wireman", "Landroidx/compose/ui/platform/AndroidComposeView$wireman;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "setterwort", "Ljava/lang/Runnable;", "sendHoverExitEvent", "hoverExitReceived", "attendance", "Lkotlin/jvm/functions/Function0;", "resendMotionEventOnLayout", "Landroidx/compose/ui/platform/saran;", "Landroidx/compose/ui/platform/saran;", "matrixToWindow", "lampshade", "keyboardModifiersRequireUpdate", "Landroidx/compose/ui/scrollcapture/ScrollCapture;", "libyan", "Landroidx/compose/ui/scrollcapture/ScrollCapture;", "scrollCapture", "Lstarveling/polloi;", "deadwork", "Lstarveling/polloi;", "getPointerIconService", "()Lstarveling/polloi;", "pointerIconService", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/platform/homozygous;", "getWindowInfo", "()Landroidx/compose/ui/platform/homozygous;", "windowInfo", "Lsealless/impromptu;", "getAutofill", "()Lsealless/impromptu;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/layout/gintrap$attabal;", "getPlacementScope", "()Landroidx/compose/ui/layout/gintrap$attabal;", "placementScope", "Lsaran/saneness;", "getInputModeManager", "()Lsaran/saneness;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "molet", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidComposeView extends ViewGroup implements androidx.compose.ui.node.peridotite, mastfed, starveling.yemenite, androidx.p001lifecycle.marial {

    /* JADX INFO: renamed from: basify, reason: collision with root package name */
    public static Method f7094basify;

    /* JADX INFO: renamed from: immediately, reason: collision with root package name */
    public static Class<?> f7095immediately;

    /* JADX INFO: renamed from: molet, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: sakeen, reason: collision with root package name */
    public static final int f7097sakeen = 8;

    /* JADX INFO: renamed from: achondroplasia, reason: collision with root package name and from kotlin metadata */
    public final grimness.attabal hapticFeedBack;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final FocusOwner focusOwner;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean superclassInitComplete;

    /* JADX INFO: renamed from: attendance, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> resendMotionEventOnLayout;

    /* JADX INFO: renamed from: claque, reason: collision with root package name and from kotlin metadata */
    public final ModifierLocalManager modifierLocalManager;

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name and from kotlin metadata */
    public DrawChildContainer viewLayersContainer;

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name and from kotlin metadata */
    public final float[] windowToViewMatrix;

    /* JADX INFO: renamed from: coi, reason: collision with root package name and from kotlin metadata */
    public final tout viewTreeOwners;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.attabal keyInputModifier;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name and from kotlin metadata */
    public final starveling.preprohormone pointerInputEventProcessor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.attabal rotaryInputModifier;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.node.sealless measureAndLayoutDelegate;

    /* JADX INFO: renamed from: czestochowa, reason: collision with root package name and from kotlin metadata */
    public Function1<? super saneness, Unit> onViewTreeOwnersAvailable;

    /* JADX INFO: renamed from: deadwork, reason: collision with root package name and from kotlin metadata */
    public final starveling.polloi pointerIconService;

    /* JADX INFO: renamed from: dent, reason: collision with root package name and from kotlin metadata */
    public milliradian.saneness onMeasureConstraints;

    /* JADX INFO: renamed from: dhss, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<Function0<Unit>> endApplyChangesListeners;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener;

    /* JADX INFO: renamed from: empress, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.czestochowa _viewTreeOwners;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final EmptySemanticsElement semanticsModifier;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
    public boolean isDrawingContent;

    /* JADX INFO: renamed from: gusty, reason: collision with root package name and from kotlin metadata */
    public final AtomicReference textInputSessionMutex;

    /* JADX INFO: renamed from: hardpan, reason: collision with root package name and from kotlin metadata */
    public final claque textToolbar;

    /* JADX INFO: renamed from: herdbook, reason: collision with root package name and from kotlin metadata */
    public MotionEvent previousMotionEvent;

    /* JADX INFO: renamed from: homozygous, reason: collision with root package name and from kotlin metadata */
    public final saran matrixToWindow;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name and from kotlin metadata */
    public final sealless.wireman _autofill;

    /* JADX INFO: renamed from: igbo, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.text.input.oilcan textInputService;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name and from kotlin metadata */
    public final float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: julian, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.czestochowa layoutDirection;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public AndroidContentCaptureManager contentCaptureManager;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public long lastDownPointerPosition;

    /* JADX INFO: renamed from: lampshade, reason: collision with root package name and from kotlin metadata */
    public boolean keyboardModifiersRequireUpdate;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name and from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* JADX INFO: renamed from: libyan, reason: collision with root package name and from kotlin metadata */
    public final ScrollCapture scrollCapture;

    /* JADX INFO: renamed from: lightstruck, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.czestochowa fontFamilyResolver;

    /* JADX INFO: renamed from: lotta, reason: collision with root package name and from kotlin metadata */
    public long windowPosition;

    /* JADX INFO: renamed from: mastfed, reason: collision with root package name and from kotlin metadata */
    public boolean hoverExitReceived;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name and from kotlin metadata */
    public final OwnerSnapshotObserver snapshotObserver;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public final sealless.preprohormone autofillTree;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name and from kotlin metadata */
    public final int[] tmpPositionArray;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.semantics.marial rootSemanticsNode;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.node.cord sharedDrawScope;

    /* JADX INFO: renamed from: monroe, reason: collision with root package name and from kotlin metadata */
    public int currentFontWeightAdjustment;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name and from kotlin metadata */
    public boolean forceUseMatrixCache;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.node.cultivated rootForTest;

    /* JADX INFO: renamed from: outmarry, reason: collision with root package name and from kotlin metadata */
    public final attendance<androidx.compose.ui.node.walach> layerCache;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name and from kotlin metadata */
    public AndroidViewsHandler _androidViewsHandler;

    /* JADX INFO: renamed from: palmyra, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.text.font.impromptu.saneness fontLoader;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name and from kotlin metadata */
    public final cutely clipboardManager;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name and from kotlin metadata */
    public boolean wasMeasuredWithMultipleConstraints;

    /* JADX INFO: renamed from: picketboat, reason: collision with root package name and from kotlin metadata */
    public final unconsolidated softwareKeyboardController;

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    public final List<androidx.compose.ui.node.walach> dirtyLayers;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.czestochowa density;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name and from kotlin metadata */
    public final outmarry viewConfiguration;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final lampshade _windowInfo;

    /* JADX INFO: renamed from: preterite, reason: collision with root package name and from kotlin metadata */
    public final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name and from kotlin metadata */
    public final starveling.beachfront motionEventAdapter;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public final restrictive.milliradian graphicsContext;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.draganddrop.dern dragAndDropManager;

    /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
    public boolean isPendingInteropViewLayoutChangeDispatch;

    /* JADX INFO: renamed from: sayid, reason: collision with root package name and from kotlin metadata */
    public boolean isRenderNodeCompatible;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
    public List<androidx.compose.ui.node.walach> postponedDirtyLayers;

    /* JADX INFO: renamed from: sensatory, reason: collision with root package name and from kotlin metadata */
    public final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;

    /* JADX INFO: renamed from: setterwort, reason: collision with root package name and from kotlin metadata */
    public final Runnable sendHoverExitEvent;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name and from kotlin metadata */
    public Function1<? super Configuration, Unit> configurationChangeObserver;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final restrictive.starveling canvasHolder;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public final taiyuan accessibilityManager;

    /* JADX INFO: renamed from: technofreak, reason: collision with root package name and from kotlin metadata */
    public long relayoutTime;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name and from kotlin metadata */
    public long globalPosition;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name and from kotlin metadata */
    public final float[] tmpMatrix;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode root;

    /* JADX INFO: renamed from: unconsolidated, reason: collision with root package name and from kotlin metadata */
    public final saran.dern _inputModeManager;

    /* JADX INFO: renamed from: underbelly, reason: collision with root package name and from kotlin metadata */
    public final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;

    /* JADX INFO: renamed from: vesuvio, reason: collision with root package name and from kotlin metadata */
    public final wireman resendMotionEventRunnable;

    /* JADX INFO: renamed from: walach, reason: collision with root package name and from kotlin metadata */
    public boolean observationClearRequested;

    /* JADX INFO: renamed from: wostteth, reason: collision with root package name and from kotlin metadata */
    public final TextInputServiceAndroid legacyTextInputServiceAndroid;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.semantics.kowloon semanticsOwner;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$attabal;", "", "<init>", "()V", "", "saneness", "()Z", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean saneness() {
            try {
                if (AndroidComposeView.f7095immediately == null) {
                    AndroidComposeView.f7095immediately = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.f7095immediately;
                    AndroidComposeView.f7094basify = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.f7094basify;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$dern", "Lstarveling/polloi;", "Lstarveling/monoploid;", "attabal", "Lstarveling/monoploid;", "currentIcon", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class dern implements starveling.polloi {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public starveling.monoploid currentIcon = starveling.monoploid.INSTANCE.attabal();

        public dern() {
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$saneness;", "", "Landroidx/lifecycle/arytenoidectomy;", "lifecycleOwner", "Linrooted/taiyuan;", "savedStateRegistryOwner", "<init>", "(Landroidx/lifecycle/arytenoidectomy;Linrooted/taiyuan;)V", "attabal", "Landroidx/lifecycle/arytenoidectomy;", "()Landroidx/lifecycle/arytenoidectomy;", "saneness", "Linrooted/taiyuan;", "()Linrooted/taiyuan;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final androidx.p001lifecycle.arytenoidectomy lifecycleOwner;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final inrooted.taiyuan savedStateRegistryOwner;

        public saneness(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar, inrooted.taiyuan taiyuanVar) {
            this.lifecycleOwner = arytenoidectomyVar;
            this.savedStateRegistryOwner = taiyuanVar;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final androidx.p001lifecycle.arytenoidectomy getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final inrooted.taiyuan getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$wireman", "Ljava/lang/Runnable;", "", "run", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class wireman implements Runnable {
        public wireman() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.previousMotionEvent;
            if (motionEvent != null) {
                boolean z = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.vesuvio(motionEvent, i, androidComposeView.relayoutTime, false);
            }
        }
    }

    public AndroidComposeView(Context context, CoroutineContext coroutineContext) {
        super(context);
        supplicat.competently.Companion companion = supplicat.competently.INSTANCE;
        this.lastDownPointerPosition = companion.saneness();
        this.superclassInitComplete = true;
        byte b = 0;
        byte b2 = 0;
        this.sharedDrawScope = new androidx.compose.ui.node.cord(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        this.density = liable.dern(milliradian.attabal.attabal(context), liable.beachfront());
        androidx.compose.ui.semantics.marial marialVar = new androidx.compose.ui.semantics.marial();
        this.rootSemanticsNode = marialVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(marialVar);
        this.semanticsModifier = emptySemanticsElement;
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this), new AndroidComposeView$focusOwner$2(this), new AndroidComposeView$focusOwner$3(this), new AndroidComposeView$focusOwner$4(this), new AndroidComposeView$focusOwner$5(this), new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$6
            @Override // p002kotlin.jvm.internal.MutablePropertyReference0Impl, p002kotlin.jvm.internal.MutablePropertyReference0
            public Object get() {
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            }

            @Override // p002kotlin.jvm.internal.MutablePropertyReference0Impl, p002kotlin.jvm.internal.MutablePropertyReference0, kurbash.cutely
            public void set(Object obj) {
                ((AndroidComposeView) this.receiver).setLayoutDirection((LayoutDirection) obj);
            }
        });
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new AndroidComposeView$dragAndDropModifierOnDragListener$1(this));
        this.dragAndDropModifierOnDragListener = dragAndDropModifierOnDragListener;
        this.coroutineContext = coroutineContext;
        this.dragAndDropManager = dragAndDropModifierOnDragListener;
        this._windowInfo = new lampshade();
        androidx.compose.ui.attabal.Companion companion2 = androidx.compose.ui.attabal.INSTANCE;
        androidx.compose.ui.attabal attabalVarAttabal = androidx.compose.ui.input.key.attabal.attabal(companion2, new Function1<privatdozent.saneness, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(privatdozent.saneness sanenessVar) {
                return m9invokeZmokQxo(sanenessVar.getNativeKeyEvent());
            }

            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m9invokeZmokQxo(KeyEvent keyEvent) {
                final androidx.compose.ui.focus.saneness sanenessVarTreadless = this.this$0.treadless(keyEvent);
                if (sanenessVarTreadless == null || !privatdozent.dern.beachfront(privatdozent.wireman.saneness(keyEvent), privatdozent.dern.INSTANCE.attabal())) {
                    return Boolean.FALSE;
                }
                supplicat.taiyuan taiyuanVarGusty = this.this$0.gusty();
                Boolean boolImpromptu = this.this$0.getFocusOwner().impromptu(sanenessVarTreadless.getValue(), taiyuanVarGusty, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1
                    {
                        super(1);
                    }

                    @Override // p002kotlin.jvm.functions.Function1
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        Boolean boolApical = FocusTransactionsKt.apical(focusTargetNode, sanenessVarTreadless.getValue());
                        return Boolean.valueOf(boolApical != null ? boolApical.booleanValue() : true);
                    }
                });
                if (boolImpromptu != null ? boolImpromptu.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!androidx.compose.ui.focus.apical.attabal(sanenessVarTreadless.getValue())) {
                    return Boolean.FALSE;
                }
                Integer numDern = androidx.compose.ui.focus.competently.dern(sanenessVarTreadless.getValue());
                if (numDern == null) {
                    throw new IllegalStateException("Invalid focus direction");
                }
                int iIntValue = numDern.intValue();
                Rect rectSaneness = taiyuanVarGusty != null ? restrictive.czestochowa.saneness(taiyuanVarGusty) : null;
                if (rectSaneness == null) {
                    throw new IllegalStateException("Invalid rect");
                }
                View viewTimberyard = this.this$0.timberyard(iIntValue);
                if (Intrinsics.wireman(viewTimberyard, this.this$0)) {
                    viewTimberyard = null;
                }
                if (viewTimberyard != null && androidx.compose.ui.focus.competently.saneness(viewTimberyard, Integer.valueOf(iIntValue), rectSaneness)) {
                    return Boolean.TRUE;
                }
                if (!this.this$0.getFocusOwner().taiyuan(false, true, false, sanenessVarTreadless.getValue())) {
                    return Boolean.TRUE;
                }
                Boolean boolImpromptu2 = this.this$0.getFocusOwner().impromptu(sanenessVarTreadless.getValue(), null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1.1
                    {
                        super(1);
                    }

                    @Override // p002kotlin.jvm.functions.Function1
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        Boolean boolApical = FocusTransactionsKt.apical(focusTargetNode, sanenessVarTreadless.getValue());
                        return Boolean.valueOf(boolApical != null ? boolApical.booleanValue() : true);
                    }
                });
                return Boolean.valueOf(boolImpromptu2 != null ? boolImpromptu2.booleanValue() : true);
            }
        });
        this.keyInputModifier = attabalVarAttabal;
        androidx.compose.ui.attabal attabalVarAttabal2 = androidx.compose.ui.input.rotary.attabal.attabal(companion2, new Function1<RotaryScrollEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
                return Boolean.FALSE;
            }
        });
        this.rotaryInputModifier = attabalVarAttabal2;
        this.canvasHolder = new restrictive.starveling();
        LayoutNode layoutNode = new LayoutNode(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        layoutNode.stupefactive(RootMeasurePolicy.f6733saneness);
        layoutNode.demilitarize(getDensity());
        layoutNode.libya(companion2.impassible(emptySemanticsElement).impassible(attabalVarAttabal2).impassible(attabalVarAttabal).impassible(getFocusOwner().getModifier()).impassible(dragAndDropModifierOnDragListener.getModifier()));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new androidx.compose.ui.semantics.kowloon(getRoot(), marialVar);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = new taiyuan(context);
        this.graphicsContext = restrictive.restrictive.attabal(this);
        this.autofillTree = new sealless.preprohormone();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new starveling.beachfront();
        this.pointerInputEventProcessor = new starveling.preprohormone(getRoot());
        this.configurationChangeObserver = new Function1<Configuration, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Configuration configuration) {
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.f29295attabal;
            }
        };
        this._autofill = splinterproof() ? new sealless.wireman(this, getAutofillTree()) : null;
        this.clipboardManager = new cutely(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new androidx.compose.ui.node.sealless(getRoot());
        this.viewConfiguration = new grimness(ViewConfiguration.get(context));
        this.globalPosition = milliradian.triweekly.attabal(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        float[] fArrDern = restrictive.lerp.dern(null, 1, null);
        this.tmpMatrix = fArrDern;
        this.viewToWindowMatrix = restrictive.lerp.dern(null, 1, null);
        this.windowToViewMatrix = restrictive.lerp.dern(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.attabal();
        this.isRenderNodeCompatible = true;
        this._viewTreeOwners = miliaria.saneness(null, null, 2, null);
        this.viewTreeOwners = liable.saneness(new Function0<saneness>() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final AndroidComposeView.saneness invoke() {
                return this.this$0.get_viewTreeOwners();
            }
        });
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.formularize
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.coffeecake(this.f7433kowloon);
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.impassible
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.technofreak(this.f7440kowloon);
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.triweekly
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.attendance(this.f7518kowloon, z);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.legacyTextInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = new androidx.compose.ui.text.input.oilcan(AndroidComposeView_androidKt.impromptu().invoke(textInputServiceAndroid));
        this.textInputSessionMutex = yemenite.beachfront.attabal();
        this.softwareKeyboardController = new walach(getTextInputService());
        this.fontLoader = new restrictive(context);
        this.fontFamilyResolver = liable.dern(androidx.compose.ui.text.font.apical.attabal(context), liable.beachfront());
        this.currentFontWeightAdjustment = itchy(context.getResources().getConfiguration());
        LayoutDirection layoutDirectionMarial = androidx.compose.ui.focus.competently.marial(context.getResources().getConfiguration().getLayoutDirection());
        this.layoutDirection = miliaria.saneness(layoutDirectionMarial == null ? LayoutDirection.Ltr : layoutDirectionMarial, null, 2, null);
        this.hapticFeedBack = new grimness.saneness(this);
        this._inputModeManager = new saran.dern(isInTouchMode() ? saran.attabal.INSTANCE.saneness() : saran.attabal.INSTANCE.attabal(), new Function1<saran.attabal, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(saran.attabal attabalVar) {
                return m5invokeiuPiT84(attabalVar.getValue());
            }

            /* JADX INFO: renamed from: invoke-iuPiT84, reason: not valid java name */
            public final Boolean m5invokeiuPiT84(int i) {
                boolean zRequestFocusFromTouch;
                saran.attabal.Companion companion3 = saran.attabal.INSTANCE;
                if (saran.attabal.beachfront(i, companion3.saneness())) {
                    zRequestFocusFromTouch = this.this$0.isInTouchMode();
                } else if (saran.attabal.beachfront(i, companion3.attabal())) {
                    zRequestFocusFromTouch = this.this$0.isInTouchMode() ? this.this$0.requestFocusFromTouch() : true;
                } else {
                    zRequestFocusFromTouch = false;
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            }
        }, b2 == true ? 1 : 0);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new attendance<>();
        this.endApplyChangesListeners = new androidx.compose.runtime.collection.dern<>(new Function0[16], 0);
        this.resendMotionEventRunnable = new wireman();
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.kowloon
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.outmarry(this.f7442kowloon);
            }
        };
        this.resendMotionEventOnLayout = new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
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
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        this.this$0.relayoutTime = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView = this.this$0;
                        androidComposeView.post(androidComposeView.resendMotionEventRunnable);
                    }
                }
            }
        };
        int i = Build.VERSION.SDK_INT;
        this.matrixToWindow = i < 29 ? new privatdozent(fArrDern, b == true ? 1 : 0) : new starveling();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        if (i >= 26) {
            supplicat.f7500attabal.attabal(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        androidx.core.view.premeiotic.sayid(this, androidComposeViewAccessibilityDelegateCompat);
        Function1<mastfed, Unit> function1Attabal = mastfed.INSTANCE.attabal();
        if (function1Attabal != null) {
            function1Attabal.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().apical(this);
        if (i >= 29) {
            preprohormone.f7487attabal.attabal(this);
        }
        this.scrollCapture = i >= 31 ? new ScrollCapture() : null;
        this.pointerIconService = new dern();
    }

    public static final void attendance(AndroidComposeView androidComposeView, boolean z) {
        androidComposeView._inputModeManager.attabal(z ? saran.attabal.INSTANCE.saneness() : saran.attabal.INSTANCE.attabal());
    }

    public static final void coffeecake(AndroidComposeView androidComposeView) {
        androidComposeView.homozygous();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final saneness get_viewTreeOwners() {
        return (saneness) this._viewTreeOwners.getValue();
    }

    public static /* synthetic */ void herdbook(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.hardpan(layoutNode);
    }

    public static final void outmarry(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        Intrinsics.beachfront(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.dhss(motionEvent);
    }

    private void setDensity(milliradian.wireman wiremanVar) {
        this.density.setValue(wiremanVar);
    }

    private void setFontFamilyResolver(androidx.compose.ui.text.font.taiyuan.saneness sanenessVar) {
        this.fontFamilyResolver.setValue(sanenessVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(saneness sanenessVar) {
        this._viewTreeOwners.setValue(sanenessVar);
    }

    public static /* synthetic */ void setterwort(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.vesuvio(motionEvent, i, j, z);
    }

    public static final void technofreak(AndroidComposeView androidComposeView) {
        androidComposeView.homozygous();
    }

    public final void achondroplasia() {
        this.matrixToWindow.attabal(this, this.viewToWindowMatrix);
        dent.attabal(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        addView(child, -1);
    }

    @Override // androidx.compose.ui.node.peridotite
    public void adultoid(Function0<Unit> listener) {
        if (this.endApplyChangesListeners.taiyuan(listener)) {
            return;
        }
        this.endApplyChangesListeners.saneness(listener);
    }

    @Override // starveling.yemenite
    public void apical(float[] localTransform) {
        monroe();
        restrictive.lerp.triweekly(localTransform, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.cutely(localTransform, supplicat.competently.apical(this.windowPosition), supplicat.competently.formularize(this.windowPosition), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.node.peridotite
    public void attabal(boolean sendPointerUpdate) {
        Function0<Unit> function0;
        if (this.measureAndLayoutDelegate.formularize() || this.measureAndLayoutDelegate.impassible()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (sendPointerUpdate) {
                try {
                    function0 = this.resendMotionEventOnLayout;
                } finally {
                    Trace.endSection();
                }
            } else {
                function0 = null;
            }
            if (this.measureAndLayoutDelegate.monoploid(function0)) {
                requestLayout();
            }
            androidx.compose.ui.node.sealless.wireman(this.measureAndLayoutDelegate, false, 1, null);
            premeiotic();
            Unit unit = Unit.f29295attabal;
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> values) {
        sealless.wireman wiremanVar;
        if (!splinterproof() || (wiremanVar = this._autofill) == null) {
            return;
        }
        sealless.competently.attabal(wiremanVar, values);
    }

    @Override // androidx.compose.ui.node.peridotite
    public long beachfront(long localPosition) {
        monroe();
        return restrictive.lerp.beachfront(this.viewToWindowMatrix, localPosition);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.composeAccessibilityDelegate.saran(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.composeAccessibilityDelegate.saran(true, direction, this.lastDownPointerPosition);
    }

    public final void claque() {
        this.observationClearRequested = true;
    }

    public final Object clubfoot(wretchedly.dern<? super Unit> dernVar) throws Throwable {
        Object objSaneness = this.contentCaptureManager.saneness(dernVar);
        return objSaneness == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objSaneness : Unit.f29295attabal;
    }

    public final void coi(LayoutNode node) {
        int i = 0;
        androidx.compose.ui.node.sealless.sealless(this.measureAndLayoutDelegate, node, false, 2, null);
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = node.coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            do {
                coi(layoutNodeArrApical[i]);
                i++;
            } while (i < size);
        }
    }

    @Override // androidx.compose.ui.node.peridotite
    public void competently(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.trm(layoutNode);
        herdbook(this, null, 1, null);
    }

    public final long cultivated(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return lightstruck(0, size);
        }
        if (mode == 0) {
            return lightstruck(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return lightstruck(size, size);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    public final boolean czestochowa(MotionEvent event) {
        boolean z;
        float x = event.getX();
        if (Float.isInfinite(x) || Float.isNaN(x)) {
            z = true;
        } else {
            float y = event.getY();
            if (Float.isInfinite(y) || Float.isNaN(y)) {
                z = true;
            } else {
                float rawX = event.getRawX();
                if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
                    z = true;
                } else {
                    float rawY = event.getRawY();
                    if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (!z) {
            int pointerCount = event.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                float x2 = event.getX(i);
                if (Float.isInfinite(x2) || Float.isNaN(x2)) {
                    z = true;
                } else {
                    float y2 = event.getY(i);
                    if (Float.isInfinite(y2) || Float.isNaN(y2) || (Build.VERSION.SDK_INT >= 29 && !timberyard.f7505attabal.attabal(event, i))) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public final boolean dent(LayoutNode layoutNode) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode layoutNodePermissivist = layoutNode.permissivist();
        return (layoutNodePermissivist == null || layoutNodePermissivist.stratoscope()) ? false : true;
    }

    public final int dhss(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.attabal(starveling.trm.saneness(motionEvent.getMetaState()));
        }
        starveling.gintrap gintrapVarDern = this.motionEventAdapter.dern(motionEvent, this);
        if (gintrapVarDern == null) {
            this.pointerInputEventProcessor.dern();
            return starveling.cord.attabal(false, false);
        }
        List<PointerInputEventData> listSaneness = gintrapVarDern.saneness();
        int size = listSaneness.size() - 1;
        if (size < 0) {
            pointerInputEventData = null;
            break;
        }
        while (true) {
            int i = size - 1;
            pointerInputEventData = listSaneness.get(size);
            if (pointerInputEventData.getDown()) {
                break;
            }
            if (i < 0) {
                pointerInputEventData = null;
                break;
            }
            size = i;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.getPosition();
        }
        int iSaneness = this.pointerInputEventProcessor.saneness(gintrapVarDern, this, underbelly(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && !starveling.sealless.wireman(iSaneness)) {
            this.motionEventAdapter.marial(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iSaneness;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            empress(getRoot());
        }
        androidx.compose.ui.node.peridotite.saneness(this, false, 1, null);
        androidx.compose.runtime.snapshots.formularize.INSTANCE.triweekly();
        this.isDrawingContent = true;
        restrictive.starveling starvelingVar = this.canvasHolder;
        Canvas canvasKowloon = starvelingVar.getAndroidCanvas().getInternalCanvas();
        starvelingVar.getAndroidCanvas().arytenoidectomy(canvas);
        getRoot().polloi(starvelingVar.getAndroidCanvas(), null);
        starvelingVar.getAndroidCanvas().arytenoidectomy(canvasKowloon);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i = 0; i < size; i++) {
                this.dirtyLayers.get(i).taiyuan();
            }
        }
        if (ViewLayer.INSTANCE.saneness()) {
            int iSave = canvas.save();
            canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<androidx.compose.ui.node.walach> list = this.postponedDirtyLayers;
        if (list != null) {
            Intrinsics.beachfront(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (czestochowa(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return motionEvent.isFromSource(4194304) ? nosophobia(motionEvent) : starveling.sealless.wireman(lerp(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (czestochowa(event) || !isAttachedToWindow()) {
            return false;
        }
        this.composeAccessibilityDelegate.splinterproof(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && underbelly(event)) {
                if (event.getToolType(0) == 3 && event.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent = this.previousMotionEvent;
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                this.hoverExitReceived = true;
                postDelayed(this.sendHoverExitEvent, 8L);
                return false;
            }
        } else if (!preterite(event)) {
            return false;
        }
        return starveling.sealless.wireman(lerp(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(final KeyEvent event) {
        if (!isFocused()) {
            return getFocusOwner().competently(privatdozent.saneness.saneness(event), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p002kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(event));
                }
            });
        }
        this._windowInfo.attabal(starveling.trm.saneness(event.getMetaState()));
        return FocusOwner.dern(getFocusOwner(), privatdozent.saneness.saneness(event), null, 2, null) || super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        return (isFocused() && getFocusOwner().wireman(privatdozent.saneness.saneness(event))) || super.dispatchKeyEventPreIme(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        if (Build.VERSION.SDK_INT < 28) {
            gintrap.f7434attabal.attabal(structure, getView());
        } else {
            super.dispatchProvideStructure(structure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            Intrinsics.beachfront(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || lotta(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (czestochowa(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !preterite(motionEvent)) {
            return false;
        }
        int iLerp = lerp(motionEvent);
        if (starveling.sealless.dern(iLerp)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return starveling.sealless.wireman(iLerp);
    }

    public final void empress(LayoutNode node) {
        node.sensatory();
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = node.coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i = 0;
            do {
                empress(layoutNodeArrApical[i]);
                i++;
            } while (i < size);
        }
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return milliradian(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View focused, int direction) {
        if (focused != null) {
            supplicat.taiyuan taiyuanVarAttabal = androidx.compose.ui.focus.competently.attabal(focused);
            androidx.compose.ui.focus.saneness sanenessVarWireman = androidx.compose.ui.focus.competently.wireman(direction);
            if (Intrinsics.wireman(getFocusOwner().impromptu(sanenessVarWireman != null ? sanenessVarWireman.getValue() : androidx.compose.ui.focus.saneness.INSTANCE.attabal(), taiyuanVarAttabal, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.focusSearch.1
                @Override // p002kotlin.jvm.functions.Function1
                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                    return Boolean.TRUE;
                }
            }), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(focused, direction);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        Intrinsics.beachfront(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.peridotite
    public sealless.impromptu getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.peridotite
    public sealless.preprohormone getAutofillTree() {
        return this.autofillTree;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final AndroidContentCaptureManager getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.peridotite
    public milliradian.wireman getDensity() {
        return (milliradian.wireman) this.density.getValue();
    }

    @Override // androidx.compose.ui.node.peridotite
    public androidx.compose.ui.draganddrop.dern getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.peridotite
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        Unit unit;
        supplicat.taiyuan taiyuanVarGusty = gusty();
        if (taiyuanVarGusty != null) {
            rect.left = Math.round(taiyuanVarGusty.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String());
            rect.top = Math.round(taiyuanVarGusty.getTop());
            rect.right = Math.round(taiyuanVarGusty.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String());
            rect.bottom = Math.round(taiyuanVarGusty.getBottom());
            unit = Unit.f29295attabal;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.peridotite
    public androidx.compose.ui.text.font.taiyuan.saneness getFontFamilyResolver() {
        return (androidx.compose.ui.text.font.taiyuan.saneness) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.ui.node.peridotite
    public androidx.compose.ui.text.font.impromptu.saneness getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.ui.node.peridotite
    public restrictive.milliradian getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.peridotite
    public grimness.attabal getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.formularize();
    }

    @Override // androidx.compose.ui.node.peridotite
    public saran.saneness getInputModeManager() {
        return this._inputModeManager;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.peridotite
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection.getValue();
    }

    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.arytenoidectomy();
    }

    @Override // androidx.compose.ui.node.peridotite
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.peridotite
    public androidx.compose.ui.layout.gintrap.attabal getPlacementScope() {
        return PlaceableKt.saneness(this);
    }

    @Override // androidx.compose.ui.node.peridotite
    public starveling.polloi getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.ui.node.peridotite
    public LayoutNode getRoot() {
        return this.root;
    }

    public androidx.compose.ui.node.cultivated getRootForTest() {
        return this.rootForTest;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return false;
        }
        return scrollCapture.dern();
    }

    public androidx.compose.ui.semantics.kowloon getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.peridotite
    public androidx.compose.ui.node.cord getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.peridotite
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.peridotite
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.peridotite
    public unconsolidated getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.peridotite
    public androidx.compose.ui.text.input.oilcan getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.peridotite
    public claque getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.ui.node.peridotite
    public outmarry getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final saneness getViewTreeOwners() {
        return (saneness) this.viewTreeOwners.getValue();
    }

    @Override // androidx.compose.ui.node.peridotite
    public homozygous getWindowInfo() {
        return this._windowInfo;
    }

    @Override // androidx.compose.ui.node.peridotite
    public void gintrap() {
        if (this.observationClearRequested) {
            getSnapshotObserver().saneness();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            permissivist(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.kowloon()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i = 0; i < size; i++) {
                Function0<Unit> function0 = this.endApplyChangesListeners.apical()[i];
                this.endApplyChangesListeners.gintrap(i, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.endApplyChangesListeners.graveside(0, size);
        }
    }

    @Override // starveling.yemenite
    public long graveside(long localPosition) {
        monroe();
        long jBeachfront = restrictive.lerp.beachfront(this.viewToWindowMatrix, localPosition);
        return supplicat.impromptu.attabal(supplicat.competently.apical(jBeachfront) + supplicat.competently.apical(this.windowPosition), supplicat.competently.formularize(jBeachfront) + supplicat.competently.formularize(this.windowPosition));
    }

    public final supplicat.taiyuan gusty() {
        if (isFocused()) {
            return getFocusOwner().formularize();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return androidx.compose.ui.focus.competently.attabal(viewFindFocus);
        }
        return null;
    }

    public final void hardpan(LayoutNode nodeToRemeasure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (nodeToRemeasure != null) {
            while (nodeToRemeasure != null && nodeToRemeasure.walach() == LayoutNode.UsageByParent.InMeasureBlock && dent(nodeToRemeasure)) {
                nodeToRemeasure = nodeToRemeasure.permissivist();
            }
            if (nodeToRemeasure == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void homozygous() {
        getLocationOnScreen(this.tmpPositionArray);
        long j = this.globalPosition;
        int iWireman = milliradian.impassible.wireman(j);
        int iMarial = milliradian.impassible.marial(j);
        int[] iArr = this.tmpPositionArray;
        boolean z = false;
        int i = iArr[0];
        if (iWireman != i || iMarial != iArr[1]) {
            this.globalPosition = milliradian.triweekly.attabal(i, iArr[1]);
            if (iWireman != Integer.MAX_VALUE && iMarial != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().claque();
                z = true;
            }
        }
        this.measureAndLayoutDelegate.dern(z);
    }

    public final void igbo() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        }
    }

    @Override // androidx.compose.ui.node.peridotite
    public void impassible(androidx.compose.ui.node.peridotite.saneness listener) {
        this.measureAndLayoutDelegate.dovishness(listener);
        herdbook(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.peridotite
    public void impromptu(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.underbelly(layoutNode);
        this.contentCaptureManager.molybdenite(layoutNode);
    }

    public final int itchy(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    public final void julian(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        achondroplasia();
        long jBeachfront = restrictive.lerp.beachfront(this.viewToWindowMatrix, supplicat.impromptu.attabal(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = supplicat.impromptu.attabal(motionEvent.getRawX() - supplicat.competently.apical(jBeachfront), motionEvent.getRawY() - supplicat.competently.formularize(jBeachfront));
    }

    @Override // androidx.compose.ui.node.peridotite
    public androidx.compose.ui.node.walach kowloon(Function2<? super restrictive.creditor, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer, GraphicsLayer explicitLayer) {
        if (explicitLayer != null) {
            return new GraphicsLayerOwnerLayer(explicitLayer, null, this, drawBlock, invalidateParentLayer);
        }
        androidx.compose.ui.node.walach walachVarSaneness = this.layerCache.saneness();
        if (walachVarSaneness != null) {
            walachVarSaneness.dern(drawBlock, invalidateParentLayer);
            return walachVarSaneness;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new GraphicsLayerOwnerLayer(getGraphicsContext().attabal(), getGraphicsContext(), this, drawBlock, invalidateParentLayer);
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.INSTANCE;
            if (!companion.attabal()) {
                companion.wireman(new View(getContext()));
            }
            DrawChildContainer drawChildContainer = companion.saneness() ? new DrawChildContainer(getContext()) : new ViewLayerContainer(getContext());
            this.viewLayersContainer = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.viewLayersContainer;
        Intrinsics.beachfront(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, drawBlock, invalidateParentLayer);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    public final int lerp(MotionEvent motionEvent) {
        AndroidComposeView androidComposeView;
        int i;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            julian(motionEvent);
            boolean z = true;
            this.forceUseMatrixCache = true;
            attabal(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null) {
                    try {
                        if (lotta(motionEvent, motionEvent2)) {
                            if (sensatory(motionEvent2)) {
                                this.pointerInputEventProcessor.dern();
                            } else if (motionEvent2.getActionMasked() != 10 && z2) {
                                setterwort(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z3 = motionEvent.getToolType(0) == 3;
                if (z2 || !z3 || actionMasked == 3 || actionMasked == 9 || !underbelly(motionEvent)) {
                    androidComposeView = this;
                    i = 9;
                } else {
                    i = 9;
                    androidComposeView = this;
                    setterwort(androidComposeView, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != 0) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = androidComposeView.previousMotionEvent;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = androidComposeView.previousMotionEvent;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == i && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            androidComposeView.motionEventAdapter.marial(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = androidComposeView.previousMotionEvent;
                        float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = androidComposeView.previousMotionEvent;
                        boolean z4 = (x == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = androidComposeView.previousMotionEvent;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z = false;
                        }
                        if (z4 || z) {
                            if (pointerId >= 0) {
                                androidComposeView.motionEventAdapter.marial(pointerId);
                            }
                            androidComposeView.pointerInputEventProcessor.attabal();
                        }
                    }
                }
                androidComposeView.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int iDhss = dhss(motionEvent);
                Trace.endSection();
                androidComposeView.forceUseMatrixCache = false;
                return iDhss;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.forceUseMatrixCache = false;
            throw th3;
        }
    }

    public final long lightstruck(int a, int b) {
        return patroclinal.monoploid.dern(patroclinal.monoploid.dern(b) | patroclinal.monoploid.dern(patroclinal.monoploid.dern(a) << 32));
    }

    public final boolean lotta(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    public final boolean mastfed(androidx.compose.ui.draganddrop.competently transferData, long decorationSize, Function1<? super merc.beachfront, Unit> drawDragDecoration) {
        Resources resources = getContext().getResources();
        return cord.f7411attabal.attabal(this, transferData, new androidx.compose.ui.draganddrop.attabal(milliradian.beachfront.attabal(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), decorationSize, drawDragDecoration, null));
    }

    public final View milliradian(int accessibilityId, View currentView) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.wireman(declaredMethod.invoke(currentView, null), Integer.valueOf(accessibilityId))) {
                return currentView;
            }
            if (currentView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) currentView;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewMilliradian = milliradian(accessibilityId, viewGroup.getChildAt(i));
                    if (viewMilliradian != null) {
                        return viewMilliradian;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.peridotite
    public void molybdenite(LayoutNode node) {
        this.measureAndLayoutDelegate.graveside(node);
        claque();
    }

    @Override // androidx.p001lifecycle.marial
    public void monoploid(androidx.p001lifecycle.arytenoidectomy owner) {
        setShowLayoutBounds(INSTANCE.saneness());
    }

    public final void monroe() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            achondroplasia();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = supplicat.impromptu.attabal(f - iArr2[0], f2 - iArr2[1]);
        }
    }

    public final boolean nosophobia(MotionEvent event) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -event.getAxisValue(26);
        return getFocusOwner().arytenoidectomy(new RotaryScrollEvent(androidx.core.view.treadless.cutely(viewConfiguration, getContext()) * f, f * androidx.core.view.treadless.beachfront(viewConfiguration, getContext()), event.getEventTime(), event.getDeviceId()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        androidx.p001lifecycle.arytenoidectomy lifecycleOwner;
        Lifecycle lifecycle;
        androidx.p001lifecycle.arytenoidectomy lifecycleOwner2;
        sealless.wireman wiremanVar;
        super.onAttachedToWindow();
        this._windowInfo.saneness(hasWindowFocus());
        coi(getRoot());
        empress(getRoot());
        getSnapshotObserver().apical();
        if (splinterproof() && (wiremanVar = this._autofill) != null) {
            sealless.gintrap.f37443attabal.attabal(wiremanVar);
        }
        androidx.p001lifecycle.arytenoidectomy arytenoidectomyVarAttabal = C0828overspeculate.attabal(this);
        inrooted.taiyuan taiyuanVarAttabal = inrooted.impassible.attabal(this);
        saneness viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle2 = null;
        if (viewTreeOwners == null || (arytenoidectomyVarAttabal != null && taiyuanVarAttabal != null && (arytenoidectomyVarAttabal != viewTreeOwners.getLifecycleOwner() || taiyuanVarAttabal != viewTreeOwners.getLifecycleOwner()))) {
            if (arytenoidectomyVarAttabal == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (taiyuanVarAttabal == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.wireman(this);
            }
            arytenoidectomyVarAttabal.getLifecycle().attabal(this);
            saneness sanenessVar = new saneness(arytenoidectomyVarAttabal, taiyuanVarAttabal);
            set_viewTreeOwners(sanenessVar);
            Function1<? super saneness, Unit> function1 = this.onViewTreeOwnersAvailable;
            if (function1 != null) {
                function1.invoke(sanenessVar);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.attabal(isInTouchMode() ? saran.attabal.INSTANCE.saneness() : saran.attabal.INSTANCE.attabal());
        saneness viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (lifecycleOwner2 = viewTreeOwners2.getLifecycleOwner()) != null) {
            lifecycle2 = lifecycleOwner2.getLifecycle();
        }
        if (lifecycle2 == null) {
            peridotite.attabal.dern("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle2.attabal(this);
        lifecycle2.attabal(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            yemenite.f7532attabal.saneness(this);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        merc mercVar = (merc) yemenite.beachfront.dern(this.textInputSessionMutex);
        return mercVar == null ? this.legacyTextInputServiceAndroid.getEditorHasFocus() : mercVar.saneness();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setDensity(milliradian.attabal.attabal(getContext()));
        if (itchy(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = itchy(newConfig);
            setFontFamilyResolver(androidx.compose.ui.text.font.apical.attabal(getContext()));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        merc mercVar = (merc) yemenite.beachfront.dern(this.textInputSessionMutex);
        return mercVar == null ? this.legacyTextInputServiceAndroid.beachfront(outAttrs) : mercVar.attabal(outAttrs);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        this.contentCaptureManager.arytenoidectomy(virtualIds, supportedFormats, requestsCollector);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        sealless.wireman wiremanVar;
        androidx.p001lifecycle.arytenoidectomy lifecycleOwner;
        super.onDetachedFromWindow();
        getSnapshotObserver().formularize();
        saneness viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null) ? null : lifecycleOwner.getLifecycle();
        if (lifecycle == null) {
            peridotite.attabal.dern("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle.wireman(this.contentCaptureManager);
        lifecycle.wireman(this);
        if (splinterproof() && (wiremanVar = this._autofill) != null) {
            sealless.gintrap.f37443attabal.saneness(wiremanVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            yemenite.f7532attabal.attabal(this);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus || hasFocus()) {
            return;
        }
        getFocusOwner().triweekly();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) throws Throwable {
        this.measureAndLayoutDelegate.monoploid(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        homozygous();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, r - l, b - t);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                coi(getRoot());
            }
            long jCultivated = cultivated(widthMeasureSpec);
            int iDern = (int) patroclinal.monoploid.dern(jCultivated >>> 32);
            int iDern2 = (int) patroclinal.monoploid.dern(jCultivated & 4294967295L);
            long jCultivated2 = cultivated(heightMeasureSpec);
            long jAttabal = milliradian.dern.attabal(iDern, iDern2, (int) patroclinal.monoploid.dern(jCultivated2 >>> 32), (int) patroclinal.monoploid.dern(4294967295L & jCultivated2));
            milliradian.saneness sanenessVar = this.onMeasureConstraints;
            boolean zWireman = false;
            if (sanenessVar == null) {
                this.onMeasureConstraints = milliradian.saneness.attabal(jAttabal);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (sanenessVar != null) {
                    zWireman = milliradian.saneness.wireman(sanenessVar.getValue(), jAttabal);
                }
                if (!zWireman) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.kattegat(jAttabal);
            this.measureAndLayoutDelegate.polloi();
            setMeasuredDimension(getRoot().milliradian(), getRoot().trm());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().milliradian(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().trm(), 1073741824));
            }
            Unit unit = Unit.f29295attabal;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        sealless.wireman wiremanVar;
        if (!splinterproof() || structure == null || (wiremanVar = this._autofill) == null) {
            return;
        }
        sealless.competently.saneness(wiremanVar, structure);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirectionMarial = androidx.compose.ui.focus.competently.marial(layoutDirection);
            if (layoutDirectionMarial == null) {
                layoutDirectionMarial = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirectionMarial);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(Rect localVisibleRect, Point windowOffset, Consumer<ScrollCaptureTarget> targets) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.wireman(this, getSemanticsOwner(), getCoroutineContext(), targets);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> response) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.gintrap(androidContentCaptureManager, response);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean zSaneness;
        this._windowInfo.saneness(hasWindowFocus);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || getShowLayoutBounds() == (zSaneness = INSTANCE.saneness())) {
            return;
        }
        setShowLayoutBounds(zSaneness);
        sayid();
    }

    public final Object overspeculate(wretchedly.dern<? super Unit> dernVar) {
        Object objGrimness = this.composeAccessibilityDelegate.grimness(dernVar);
        return objGrimness == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objGrimness : Unit.f29295attabal;
    }

    public final boolean palmyra(androidx.compose.ui.focus.saneness focusDirection, supplicat.taiyuan previouslyFocusedRect) {
        Integer numDern;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (numDern = androidx.compose.ui.focus.competently.dern(focusDirection.getValue())) == null) ? 130 : numDern.intValue(), previouslyFocusedRect != null ? restrictive.czestochowa.saneness(previouslyFocusedRect) : null);
    }

    public final void permissivist(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).gintrap();
            } else if (childAt instanceof ViewGroup) {
                permissivist((ViewGroup) childAt);
            }
        }
    }

    public final boolean picketboat(int focusDirection) {
        androidx.compose.ui.focus.saneness.Companion companion = androidx.compose.ui.focus.saneness.INSTANCE;
        if (androidx.compose.ui.focus.saneness.formularize(focusDirection, companion.saneness()) || androidx.compose.ui.focus.saneness.formularize(focusDirection, companion.dern())) {
            return false;
        }
        Integer numDern = androidx.compose.ui.focus.competently.dern(focusDirection);
        if (numDern == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int iIntValue = numDern.intValue();
        supplicat.taiyuan taiyuanVarGusty = gusty();
        Rect rectSaneness = taiyuanVarGusty != null ? restrictive.czestochowa.saneness(taiyuanVarGusty) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rectSaneness == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, rectSaneness, iIntValue);
        if (viewFindNextFocus != null) {
            return androidx.compose.ui.focus.competently.saneness(viewFindNextFocus, Integer.valueOf(iIntValue), rectSaneness);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.peridotite
    public void polloi(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.stratoscope(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
                hardpan(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.yemenite(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
            hardpan(layoutNode);
        }
    }

    public final void premeiotic() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    public final boolean preterite(MotionEvent event) {
        MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && motionEvent.getPointerCount() == event.getPointerCount() && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().cutely().getHasFocus()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        if (isInTouchMode()) {
            return false;
        }
        androidx.compose.ui.focus.saneness sanenessVarWireman = androidx.compose.ui.focus.competently.wireman(direction);
        final int value = sanenessVarWireman != null ? sanenessVarWireman.getValue() : androidx.compose.ui.focus.saneness.INSTANCE.saneness();
        Boolean boolImpromptu = getFocusOwner().impromptu(value, previouslyFocusedRect != null ? restrictive.czestochowa.marial(previouslyFocusedRect) : null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.requestFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolApical = FocusTransactionsKt.apical(focusTargetNode, value);
                return Boolean.valueOf(boolApical != null ? boolApical.booleanValue() : false);
            }
        });
        if (boolImpromptu != null) {
            return boolImpromptu.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.peridotite
    public void rotuma() {
        this.composeAccessibilityDelegate.preterite();
        this.contentCaptureManager.graveside();
    }

    public void sayid() {
        empress(getRoot());
    }

    public final boolean sensatory(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.composeAccessibilityDelegate.deadwork(intervalMillis);
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        this.configurationChangeObserver = function1;
    }

    public final void setContentCaptureManager$ui_release(AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        androidx.compose.ui.node.marial head = getRoot().getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String();
        if (head instanceof starveling.supplicat) {
            ((starveling.supplicat) head).preprohormone();
        }
        int iAttabal = androidx.compose.ui.node.saran.attabal(16);
        if (!head.getNode().getIsAttached()) {
            peridotite.attabal.saneness("visitSubtree called on an unattached node");
        }
        androidx.compose.ui.attabal.dern child = head.getNode().getChild();
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(head);
        androidx.compose.ui.node.polder polderVar = new androidx.compose.ui.node.polder();
        while (layoutNodeImpromptu != null) {
            if (child == null) {
                child = layoutNodeImpromptu.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String();
            }
            if ((child.getAggregateChildKindSet() & iAttabal) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & iAttabal) != 0) {
                        androidx.compose.ui.attabal.dern dernVarBeachfront = child;
                        androidx.compose.runtime.collection.dern dernVar = null;
                        while (dernVarBeachfront != 0) {
                            if (dernVarBeachfront instanceof androidx.compose.ui.node.dent) {
                                androidx.compose.ui.node.dent dentVar = (androidx.compose.ui.node.dent) dernVarBeachfront;
                                if (dentVar instanceof starveling.supplicat) {
                                    ((starveling.supplicat) dentVar).preprohormone();
                                }
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                androidx.compose.ui.attabal.dern dernVarUnderbelly = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate();
                                int i = 0;
                                dernVarBeachfront = dernVarBeachfront;
                                while (dernVarUnderbelly != null) {
                                    if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dernVarBeachfront = dernVarUnderbelly;
                                        } else {
                                            if (dernVar == null) {
                                                dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != 0) {
                                                dernVar.saneness(dernVarBeachfront);
                                                dernVarBeachfront = 0;
                                            }
                                            dernVar.saneness(dernVarUnderbelly);
                                        }
                                    }
                                    dernVarUnderbelly = dernVarUnderbelly.getChild();
                                    dernVarBeachfront = dernVarBeachfront;
                                }
                                if (i == 1) {
                                }
                            }
                            dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar);
                        }
                    }
                    child = child.getChild();
                }
            }
            polderVar.dern(layoutNodeImpromptu.coffeecake());
            layoutNodeImpromptu = polderVar.attabal() ? (LayoutNode) polderVar.saneness() : null;
            child = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super saneness, Unit> callback) {
        saneness viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    @Override // androidx.compose.ui.node.peridotite
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean splinterproof() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Override // androidx.compose.ui.node.peridotite
    public void taiyuan(LayoutNode layoutNode, boolean affectsLookahead) {
        this.measureAndLayoutDelegate.impromptu(layoutNode, affectsLookahead);
    }

    public final View timberyard(int direction) {
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            Intrinsics.competently(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, direction);
            if (viewFindNextFocus != null && !AndroidComposeView_androidKt.marial(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    public androidx.compose.ui.focus.saneness treadless(KeyEvent keyEvent) {
        long jAttabal = privatdozent.wireman.attabal(keyEvent);
        privatdozent.attabal.Companion companion = privatdozent.attabal.INSTANCE;
        if (privatdozent.attabal.triweekly(jAttabal, companion.formularize())) {
            return androidx.compose.ui.focus.saneness.taiyuan(privatdozent.wireman.dern(keyEvent) ? androidx.compose.ui.focus.saneness.INSTANCE.beachfront() : androidx.compose.ui.focus.saneness.INSTANCE.marial());
        }
        if (privatdozent.attabal.triweekly(jAttabal, companion.marial())) {
            return androidx.compose.ui.focus.saneness.taiyuan(androidx.compose.ui.focus.saneness.INSTANCE.competently());
        }
        if (privatdozent.attabal.triweekly(jAttabal, companion.wireman())) {
            return androidx.compose.ui.focus.saneness.taiyuan(androidx.compose.ui.focus.saneness.INSTANCE.wireman());
        }
        if (privatdozent.attabal.triweekly(jAttabal, companion.beachfront()) ? true : privatdozent.attabal.triweekly(jAttabal, companion.apical())) {
            return androidx.compose.ui.focus.saneness.taiyuan(androidx.compose.ui.focus.saneness.INSTANCE.impromptu());
        }
        if (privatdozent.attabal.triweekly(jAttabal, companion.dern()) ? true : privatdozent.attabal.triweekly(jAttabal, companion.cutely())) {
            return androidx.compose.ui.focus.saneness.taiyuan(androidx.compose.ui.focus.saneness.INSTANCE.attabal());
        }
        if (privatdozent.attabal.triweekly(jAttabal, companion.saneness()) ? true : privatdozent.attabal.triweekly(jAttabal, companion.competently()) ? true : privatdozent.attabal.triweekly(jAttabal, companion.taiyuan())) {
            return androidx.compose.ui.focus.saneness.taiyuan(androidx.compose.ui.focus.saneness.INSTANCE.saneness());
        }
        if (privatdozent.attabal.triweekly(jAttabal, companion.attabal()) ? true : privatdozent.attabal.triweekly(jAttabal, companion.impromptu())) {
            return androidx.compose.ui.focus.saneness.taiyuan(androidx.compose.ui.focus.saneness.INSTANCE.dern());
        }
        return null;
    }

    @Override // starveling.yemenite
    public long triweekly(long positionOnScreen) {
        monroe();
        return restrictive.lerp.beachfront(this.windowToViewMatrix, supplicat.impromptu.attabal(supplicat.competently.apical(positionOnScreen) - supplicat.competently.apical(this.windowPosition), supplicat.competently.formularize(positionOnScreen) - supplicat.competently.formularize(this.windowPosition)));
    }

    public final boolean unconsolidated(androidx.compose.ui.node.walach layer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.INSTANCE.saneness();
        }
        this.layerCache.dern(layer);
        return true;
    }

    public final boolean underbelly(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= x && x <= ((float) getWidth()) && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= y && y <= ((float) getHeight());
    }

    public final void vesuvio(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            pointerPropertiesArr[i] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerCoordsArr[i2] = new MotionEvent.PointerCoords();
        }
        int i3 = 0;
        while (i3 < pointerCount) {
            int i4 = ((actionIndex < 0 || i3 < actionIndex) ? 0 : 1) + i3;
            motionEvent.getPointerProperties(i4, pointerPropertiesArr[i3]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i3];
            motionEvent.getPointerCoords(i4, pointerCoords);
            long jGraveside = graveside(supplicat.impromptu.attabal(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = supplicat.competently.apical(jGraveside);
            pointerCoords.y = supplicat.competently.formularize(jGraveside);
            i3++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        starveling.gintrap gintrapVarDern = this.motionEventAdapter.dern(motionEventObtain, this);
        Intrinsics.beachfront(gintrapVarDern);
        this.pointerInputEventProcessor.saneness(gintrapVarDern, this, true);
        motionEventObtain.recycle();
    }

    @Override // androidx.compose.ui.node.peridotite
    public void wireman(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.cuirassed(layoutNode, forceRequest)) {
                herdbook(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.oilcan(layoutNode, forceRequest)) {
            herdbook(this, null, 1, null);
        }
    }

    public final void wostteth(androidx.compose.ui.node.walach layer, boolean isDirty) {
        if (!isDirty) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(layer);
            List<androidx.compose.ui.node.walach> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(layer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(layer);
            return;
        }
        List arrayList = this.postponedDirtyLayers;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.postponedDirtyLayers = arrayList;
        }
        arrayList.add(layer);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        Intrinsics.beachfront(child);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(child, index, layoutParams);
    }

    @Override // androidx.compose.ui.node.peridotite
    public taiyuan getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.peridotite
    public cutely getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = width;
        layoutParamsGenerateDefaultLayoutParams.height = height;
        Unit unit = Unit.f29295attabal;
        addView(child, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        addView(child, -1, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        addViewInLayout(child, index, params, true);
    }

    @patroclinal.wireman
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.peridotite
    public void arytenoidectomy(LayoutNode node) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }
}
