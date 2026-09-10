package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.p001lifecycle.Lifecycle;
import clubfoot.TextLayoutResult;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0010\u00ad\u0001Å\u0002³\u0001·\u0001¿\u0001È\u0001Ì\u0001Ô\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JK\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0019\u001a\u00020\t2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c2\u0014\b\u0002\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"JC\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001b2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c2\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001f0\u001eH\u0002¢\u0006\u0004\b'\u0010(J+\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020&H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b9\u00108J\u001f\u0010:\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b:\u00105J\u0017\u0010;\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b;\u0010/J\u001f\u0010<\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u00105J\u0019\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u0004\u0018\u00010@*\u00020=H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\bC\u00105J\u0017\u0010D\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bF\u0010EJ=\u0010K\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\t2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020M2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000bH\u0003¢\u0006\u0004\bQ\u0010RJ?\u0010X\u001a\u00020M2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000b2\b\u0010T\u001a\u0004\u0018\u00010\u000b2\b\u0010U\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bZ\u0010EJ)\u0010^\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u000b2\b\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\b^\u0010_J1\u0010a\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00122\u0006\u0010`\u001a\u0002062\b\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bc\u0010dJ/\u0010g\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010e*\u00020V2\b\u0010W\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020&2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020&2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bm\u0010lJ\u001f\u0010p\u001a\u00020&2\u0006\u0010j\u001a\u00020i2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020&H\u0002¢\u0006\u0004\br\u0010-J\u000f\u0010s\u001a\u00020&H\u0002¢\u0006\u0004\bs\u0010-J\u001d\u0010u\u001a\u00020&2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\bu\u0010vJ%\u0010z\u001a\u00020\t2\u0006\u0010w\u001a\u00020\u000b2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0IH\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020&2\u0006\u0010|\u001a\u00020xH\u0002¢\u0006\u0004\b}\u0010~J-\u0010\u0081\u0001\u001a\u00020&2\u0006\u0010\u007f\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000b2\t\u0010\u0080\u0001\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J%\u0010\u0086\u0001\u001a\u00020&2\u0007\u0010\u0083\u0001\u001a\u00020\u001b2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010w\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J5\u0010\u008d\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001b2\u0007\u0010\u008a\u0001\u001a\u00020\u000b2\u0007\u0010\u008b\u0001\u001a\u00020\t2\u0007\u0010\u008c\u0001\u001a\u00020\tH\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0019\u0010\u008f\u0001\u001a\u00020&2\u0006\u0010\u007f\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u008f\u0001\u0010dJ5\u0010\u0093\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001b2\u0007\u0010\u0090\u0001\u001a\u00020\u000b2\u0007\u0010\u0091\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001a\u0010\u0095\u0001\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001a\u0010\u0097\u0001\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0019\u0010\u0098\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0098\u0001\u0010/J(\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b2\u0007\u0010\u008a\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001d\u0010\u009c\u0001\u001a\u0004\u0018\u0001062\b\u0010\u0015\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0005\b\u009c\u0001\u00108J\u0019\u0010\u009e\u0001\u001a\u0004\u0018\u00010=*\u00030\u009d\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J-\u0010 \u0001\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001J\u001b\u0010£\u0001\u001a\u00020\t2\u0007\u0010N\u001a\u00030¢\u0001H\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J&\u0010¨\u0001\u001a\u00020\u000b2\b\u0010¦\u0001\u001a\u00030¥\u00012\b\u0010§\u0001\u001a\u00030¥\u0001H\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001d\u0010\u00ad\u0001\u001a\u00030¬\u00012\b\u0010«\u0001\u001a\u00030ª\u0001H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0011\u0010¯\u0001\u001a\u00020&H\u0000¢\u0006\u0005\b¯\u0001\u0010-J\u0013\u0010°\u0001\u001a\u00020&H\u0080@¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0019\u0010²\u0001\u001a\u00020&2\u0006\u0010j\u001a\u00020iH\u0000¢\u0006\u0005\b²\u0001\u0010lR\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R/\u0010½\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b·\u0001\u0010¸\u0001\u0012\u0005\b¼\u0001\u0010-\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0005\b»\u0001\u0010dR=\u0010Æ\u0001\u001a\u000f\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\t0¾\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b¿\u0001\u0010À\u0001\u0012\u0005\bÅ\u0001\u0010-\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010Ê\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R2\u0010Ò\u0001\u001a\u00020\t2\u0007\u0010Ë\u0001\u001a\u00020\t8\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R*\u0010Ú\u0001\u001a\u00030Ó\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Þ\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010â\u0001\u001a\u00030ß\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001RD\u0010ç\u0001\u001a-\u0012\u000f\u0012\r ä\u0001*\u0005\u0018\u00010ã\u00010ã\u0001 ä\u0001*\u0015\u0012\u000f\u0012\r ä\u0001*\u0005\u0018\u00010ã\u00010ã\u0001\u0018\u00010I0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u0018\u0010ë\u0001\u001a\u00030è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u001e\u0010ï\u0001\u001a\u00070ì\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0019\u0010ñ\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010¸\u0001R\u001b\u0010ô\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0019\u0010ö\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010Í\u0001R\u001e\u0010ú\u0001\u001a\t\u0012\u0005\u0012\u00030÷\u00010\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u001e\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030÷\u00010\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ù\u0001R'\u0010\u0080\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020V0ý\u00010ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R'\u0010\u0083\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020V0\u0081\u00020ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010ÿ\u0001R\u0019\u0010\u0085\u0002\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010¸\u0001R\u001b\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001e\u0010\u008c\u0002\u001a\t\u0012\u0004\u0012\u00020i0\u0089\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001e\u0010\u0090\u0002\u001a\t\u0012\u0004\u0012\u00020&0\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0019\u0010\u0092\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010Í\u0001R\u001c\u0010\u0096\u0002\u001a\u0005\u0018\u00010\u0093\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0019\u0010\u009d\u0002\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R*\u0010¥\u0002\u001a\u00030\u009e\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009f\u0002\u0010 \u0002\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002R*\u0010©\u0002\u001a\u00030\u009e\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¦\u0002\u0010 \u0002\u001a\u0006\b§\u0002\u0010¢\u0002\"\u0006\b¨\u0002\u0010¤\u0002R\u001f\u0010®\u0002\u001a\u0002068\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bª\u0002\u0010«\u0002\u001a\u0006\b¬\u0002\u0010\u00ad\u0002R\u001f\u0010±\u0002\u001a\u0002068\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¯\u0002\u0010«\u0002\u001a\u0006\b°\u0002\u0010\u00ad\u0002R\u0018\u0010µ\u0002\u001a\u00030²\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0002\u0010´\u0002R \u0010·\u0002\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010ù\u0001R\u001a\u0010º\u0002\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0002\u0010¹\u0002R\u0018\u0010»\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010Í\u0001R\u0017\u0010¾\u0002\u001a\u00030¼\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010½\u0002R\u001d\u0010¿\u0002\u001a\b\u0012\u0004\u0012\u00020x0\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010æ\u0001R$\u0010À\u0002\u001a\u000f\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020&0¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010À\u0001R\u0017\u0010Â\u0002\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010Ï\u0001R\u0017\u0010Ä\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ï\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Æ\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/attabal;", "Landroidx/compose/ui/platform/AndroidComposeView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroidx/collection/kowloon;", "Landroidx/compose/ui/platform/monroe;", "currentSemanticsNodes", "", "vertical", "", "direction", "Lsupplicat/competently;", X3.i.L, "privatdozent", "(Landroidx/collection/kowloon;ZIJ)Z", "virtualViewId", "Loutmarry/rotuma;", "walach", "(I)Loutmarry/rotuma;", "node", "Landroid/graphics/Rect;", "seminary", "(Landroidx/compose/ui/platform/monroe;)Landroid/graphics/Rect;", "layoutIsRtl", "Ljava/util/ArrayList;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/collections/ArrayList;", "parentListToSort", "Landroidx/collection/yemenite;", "", "containerChildrenMapping", "basify", "(ZLjava/util/ArrayList;Landroidx/collection/yemenite;)Ljava/util/List;", "currNode", "geometryList", "containerMapToChildren", "", "clubfoot", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/ArrayList;Landroidx/collection/yemenite;)V", "listToSort", "osteal", "(ZLjava/util/List;)Ljava/util/List;", "immediately", "()V", "coi", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "info", "semanticsNode", "picketboat", "(ILoutmarry/rotuma;Landroidx/compose/ui/semantics/SemanticsNode;)V", "lampshade", "(Landroidx/compose/ui/semantics/SemanticsNode;Loutmarry/rotuma;)V", "", "timberyard", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "peridotite", "molet", "premeiotic", "libyan", "Landroidx/compose/ui/text/attabal;", "milliradian", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/text/attabal;", "Landroid/text/SpannableString;", "licking", "(Landroidx/compose/ui/text/attabal;)Landroid/text/SpannableString;", "sakeen", "lotta", "(I)Z", "julian", "eventType", "contentChangeType", "", "contentDescription", "technofreak", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", NotificationCompat.CATEGORY_EVENT, "herdbook", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "hydrovane", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "mathsort", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "starveling", "action", "Landroid/os/Bundle;", "arguments", "wostteth", "(IILandroid/os/Bundle;)Z", "extraDataKey", "polder", "(ILoutmarry/rotuma;Ljava/lang/String;Landroid/os/Bundle;)V", "pruinose", "(I)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "size", "cosy", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "sensatory", "(Landroidx/compose/ui/node/LayoutNode;)V", "attendance", "Landroidx/collection/sealless;", "subtreeChangedSemanticsNodesIds", "mastfed", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/collection/sealless;)V", "creditor", "tarboosh", "newSemanticsNodes", "setterwort", "(Landroidx/collection/kowloon;)V", "id", "Landroidx/compose/ui/platform/palmyra;", "oldScrollObservationScopes", "monroe", "(ILjava/util/List;)Z", "scrollObservationScope", "achondroplasia", "(Landroidx/compose/ui/platform/palmyra;)V", "semanticsNodeId", "title", "dhss", "(IILjava/lang/String;)V", "newNode", "Landroidx/compose/ui/platform/lightstruck;", "oldNode", "hardpan", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/lightstruck;)V", "claque", "(I)I", "granularity", ToolBar.FORWARD, "extendSelection", "fastrack", "(Landroidx/compose/ui/semantics/SemanticsNode;IZZ)Z", "vesuvio", "start", TtmlNode.END, "traversalMode", "homozygous", "(Landroidx/compose/ui/semantics/SemanticsNode;IIZ)Z", "permissivist", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "dent", "sayid", "Landroidx/compose/ui/platform/beachfront;", "itchy", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/beachfront;", "treadless", "Landroidx/compose/ui/semantics/apical;", "coffeecake", "(Landroidx/compose/ui/semantics/apical;)Landroidx/compose/ui/text/attabal;", "saran", "(ZIJ)Z", "Landroid/view/MotionEvent;", "splinterproof", "(Landroid/view/MotionEvent;)Z", "", "x", "y", "nosophobia", "(FF)I", "Landroid/view/View;", "host", "Loutmarry/preprohormone;", "saneness", "(Landroid/view/View;)Loutmarry/preprohormone;", "preterite", "grimness", "(Lwretchedly/dern;)Ljava/lang/Object;", "underbelly", "wireman", "Landroidx/compose/ui/platform/AndroidComposeView;", "lerp", "()Landroidx/compose/ui/platform/AndroidComposeView;", "marial", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "getHoveredVirtualViewId$ui_release$annotations", "hoveredVirtualViewId", "Lkotlin/Function1;", "beachfront", "Lkotlin/jvm/functions/Function1;", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnSendAccessibilityEvent$ui_release$annotations", "onSendAccessibilityEvent", "Landroid/view/accessibility/AccessibilityManager;", "competently", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "value", "impromptu", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "", "taiyuan", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "deadwork", "(J)V", "SendRecurringAccessibilityEventsIntervalMillis", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "cutely", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "apical", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "formularize", "Ljava/util/List;", "enabledServices", "Landroid/os/Handler;", "impassible", "Landroid/os/Handler;", "handler", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$marial;", "triweekly", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$marial;", "nodeProvider", "kowloon", "focusedVirtualViewId", "arytenoidectomy", "Loutmarry/rotuma;", "currentlyFocusedANI", "monoploid", "sendingFocusAffectingEvent", "Landroidx/compose/ui/semantics/taiyuan;", "polloi", "Landroidx/collection/yemenite;", "pendingHorizontalScrollEvents", "molybdenite", "pendingVerticalScrollEvents", "Landroidx/collection/overspeculate;", "graveside", "Landroidx/collection/overspeculate;", "actionIdToLabel", "Landroidx/collection/polder;", "adultoid", "labelToActionId", "dovishness", "accessibilityCursorPosition", "gintrap", "Ljava/lang/Integer;", "previousTraversedNode", "Landroidx/collection/saneness;", "rotuma", "Landroidx/collection/saneness;", "subtreeChangedLayoutNodes", "Lkotlinx/coroutines/channels/wireman;", "preprohormone", "Lkotlinx/coroutines/channels/wireman;", "boundsUpdateChannel", "cord", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$competently;", "cuirassed", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$competently;", "pendingTextTraversedEvent", "stratoscope", "Landroidx/collection/kowloon;", "cultivated", "()Landroidx/collection/kowloon;", "trm", "Landroidx/collection/sealless;", "paneDisplayed", "Landroidx/collection/trm;", "oilcan", "Landroidx/collection/trm;", "getIdToBeforeMap$ui_release", "()Landroidx/collection/trm;", "setIdToBeforeMap$ui_release", "(Landroidx/collection/trm;)V", "idToBeforeMap", "yemenite", "getIdToAfterMap$ui_release", "setIdToAfterMap$ui_release", "idToAfterMap", "sealless", "Ljava/lang/String;", "getExtraDataTestTraversalBeforeVal$ui_release", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "kattegat", "getExtraDataTestTraversalAfterVal$ui_release", "ExtraDataTestTraversalAfterVal", "Lcultivated/taiyuan;", "supplicat", "Lcultivated/taiyuan;", "urlSpanCache", "restrictive", "previousSemanticsNodes", "merc", "Landroidx/compose/ui/platform/lightstruck;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "czestochowa", "isTouchExplorationEnabled", "empress", "isEnabled", "dern", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat extends androidx.core.view.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.overspeculate<androidx.collection.polder<CharSequence>> labelToActionId;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public outmarry.rotuma currentlyFocusedANI;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final AccessibilityManager accessibilityManager;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public boolean currentSemanticsNodesInvalidated;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public competently pendingTextTraversedEvent;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public int accessibilityCursorPosition;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public List<AccessibilityServiceInfo> enabledServices;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public Integer previousTraversedNode;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.overspeculate<androidx.collection.overspeculate<CharSequence>> actionIdToLabel;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
    public final List<palmyra> scrollObservationScopes;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public final Handler handler;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean accessibilityForceEnabledForTesting;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public final String ExtraDataTestTraversalAfterVal;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int focusedVirtualViewId;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public lightstruck previousSemanticsRoot;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.yemenite<ScrollAxisRange> pendingVerticalScrollEvents;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean sendingFocusAffectingEvent;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.trm idToBeforeMap;

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    public boolean checkingForSemanticsChanges;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.yemenite<ScrollAxisRange> pendingHorizontalScrollEvents;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.channels.wireman<Unit> boundsUpdateChannel;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.yemenite<lightstruck> previousSemanticsNodes;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.saneness<LayoutNode> subtreeChangedLayoutNodes;

    /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
    public final Function1<palmyra, Unit> scheduleScrollEventIfNeededLambda;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public final String ExtraDataTestTraversalBeforeVal;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
    public final Runnable semanticsChangeChecker;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.kowloon<monroe> currentSemanticsNodes;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public final cultivated.taiyuan urlSpanCache;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public long SendRecurringAccessibilityEventsIntervalMillis;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public marial nodeProvider;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.sealless paneDisplayed;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView view;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.trm idToAfterMap;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public static final int f7182creditor = 8;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public static final androidx.collection.impassible f7184starveling = androidx.collection.triweekly.attabal(yemenite.wireman.accessibility_custom_action_0, yemenite.wireman.accessibility_custom_action_1, yemenite.wireman.accessibility_custom_action_2, yemenite.wireman.accessibility_custom_action_3, yemenite.wireman.accessibility_custom_action_4, yemenite.wireman.accessibility_custom_action_5, yemenite.wireman.accessibility_custom_action_6, yemenite.wireman.accessibility_custom_action_7, yemenite.wireman.accessibility_custom_action_8, yemenite.wireman.accessibility_custom_action_9, yemenite.wireman.accessibility_custom_action_10, yemenite.wireman.accessibility_custom_action_11, yemenite.wireman.accessibility_custom_action_12, yemenite.wireman.accessibility_custom_action_13, yemenite.wireman.accessibility_custom_action_14, yemenite.wireman.accessibility_custom_action_15, yemenite.wireman.accessibility_custom_action_16, yemenite.wireman.accessibility_custom_action_17, yemenite.wireman.accessibility_custom_action_18, yemenite.wireman.accessibility_custom_action_19, yemenite.wireman.accessibility_custom_action_20, yemenite.wireman.accessibility_custom_action_21, yemenite.wireman.accessibility_custom_action_22, yemenite.wireman.accessibility_custom_action_23, yemenite.wireman.accessibility_custom_action_24, yemenite.wireman.accessibility_custom_action_25, yemenite.wireman.accessibility_custom_action_26, yemenite.wireman.accessibility_custom_action_27, yemenite.wireman.accessibility_custom_action_28, yemenite.wireman.accessibility_custom_action_29, yemenite.wireman.accessibility_custom_action_30, yemenite.wireman.accessibility_custom_action_31);

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int hoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new Function1<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // p002kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.getView().getParent().requestSendAccessibilityEvent(this.this$0.getView(), accessibilityEvent));
        }
    };

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$attabal", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements View.OnAttachStateChangeListener {
        public attabal() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            accessibilityManager.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
            accessibilityManager.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
            AccessibilityManager accessibilityManager = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            accessibilityManager.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
            accessibilityManager.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$beachfront;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "<init>", "()V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "attabal", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/SemanticsNode;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class beachfront implements Comparator<SemanticsNode> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final beachfront f7223kowloon = new beachfront();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(SemanticsNode a, SemanticsNode b) {
            supplicat.taiyuan taiyuanVarCutely = a.cutely();
            supplicat.taiyuan taiyuanVarCutely2 = b.cutely();
            int iCompare = Float.compare(taiyuanVarCutely.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), taiyuanVarCutely2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(taiyuanVarCutely.getTop(), taiyuanVarCutely2.getTop());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(taiyuanVarCutely.getBottom(), taiyuanVarCutely2.getBottom());
            return iCompare3 != 0 ? iCompare3 : Float.compare(taiyuanVarCutely.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String(), taiyuanVarCutely2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String());
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$competently;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "action", "granularity", "fromIndex", "toIndex", "", "traverseTime", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "attabal", "Landroidx/compose/ui/semantics/SemanticsNode;", "wireman", "()Landroidx/compose/ui/semantics/SemanticsNode;", "saneness", "I", "()I", "dern", "marial", "beachfront", "J", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final SemanticsNode node;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final long traverseTime;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final int granularity;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final int toIndex;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final int action;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final int fromIndex;

        public competently(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final int getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: beachfront, reason: from getter */
        public final long getTraverseTime() {
            return this.traverseTime;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final int getGranularity() {
            return this.granularity;
        }

        /* JADX INFO: renamed from: marial, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final SemanticsNode getNode() {
            return this.node;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class cutely {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f7230attabal;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7230attabal = iArr;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$dern;", "", "<init>", "()V", "Loutmarry/rotuma;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "attabal", "(Loutmarry/rotuma;Landroidx/compose/ui/semantics/SemanticsNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f7231attabal = new dern();

        public static final void attabal(outmarry.rotuma info, SemanticsNode semanticsNode) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode)) {
                androidx.compose.ui.semantics.apical unmergedConfig = semanticsNode.getUnmergedConfig();
                androidx.compose.ui.semantics.cutely cutelyVar = androidx.compose.ui.semantics.cutely.f7617attabal;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(unmergedConfig, cutelyVar.arytenoidectomy());
                if (accessibilityAction != null) {
                    info.saneness(new outmarry.rotuma.attabal(R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.impassible());
                if (accessibilityAction2 != null) {
                    info.saneness(new outmarry.rotuma.attabal(R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.triweekly());
                if (accessibilityAction3 != null) {
                    info.saneness(new outmarry.rotuma.attabal(R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.kowloon());
                if (accessibilityAction4 != null) {
                    info.saneness(new outmarry.rotuma.attabal(R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$impromptu;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "<init>", "()V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "attabal", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/SemanticsNode;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class impromptu implements Comparator<SemanticsNode> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final impromptu f7232kowloon = new impromptu();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(SemanticsNode a, SemanticsNode b) {
            supplicat.taiyuan taiyuanVarCutely = a.cutely();
            supplicat.taiyuan taiyuanVarCutely2 = b.cutely();
            int iCompare = Float.compare(taiyuanVarCutely2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String(), taiyuanVarCutely.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(taiyuanVarCutely.getTop(), taiyuanVarCutely2.getTop());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(taiyuanVarCutely.getBottom(), taiyuanVarCutely2.getBottom());
            return iCompare3 != 0 ? iCompare3 : Float.compare(taiyuanVarCutely2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), taiyuanVarCutely.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String());
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$marial;", "Loutmarry/preprohormone;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "", "virtualViewId", "Loutmarry/rotuma;", "saneness", "(I)Loutmarry/rotuma;", "action", "Landroid/os/Bundle;", "arguments", "", "beachfront", "(IILandroid/os/Bundle;)Z", "info", "", "extraDataKey", "", "attabal", "(ILoutmarry/rotuma;Ljava/lang/String;Landroid/os/Bundle;)V", "focus", "wireman", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class marial extends outmarry.preprohormone {
        public marial() {
        }

        @Override // outmarry.preprohormone
        public void attabal(int virtualViewId, outmarry.rotuma info, String extraDataKey, Bundle arguments) {
            AndroidComposeViewAccessibilityDelegateCompat.this.polder(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // outmarry.preprohormone
        public boolean beachfront(int virtualViewId, int action, Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.wostteth(virtualViewId, action, arguments);
        }

        @Override // outmarry.preprohormone
        public outmarry.rotuma saneness(int virtualViewId) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            Trace.beginSection("createAccessibilityNodeInfo");
            try {
                outmarry.rotuma rotumaVarWalach = androidComposeViewAccessibilityDelegateCompat.walach(virtualViewId);
                if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent && virtualViewId == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = rotumaVarWalach;
                }
                return rotumaVarWalach;
            } finally {
                Trace.endSection();
            }
        }

        @Override // outmarry.preprohormone
        public outmarry.rotuma wireman(int focus) {
            return saneness(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$saneness;", "", "<init>", "()V", "Loutmarry/rotuma;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "attabal", "(Loutmarry/rotuma;Landroidx/compose/ui/semantics/SemanticsNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f7234attabal = new saneness();

        public static final void attabal(outmarry.rotuma info, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.cutely.f7617attabal.adultoid())) == null) {
                return;
            }
            info.saneness(new outmarry.rotuma.attabal(R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\f\u001a\u00020\u000b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$taiyuan;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "Lsupplicat/taiyuan;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "<init>", "()V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "attabal", "(Lkotlin/Pair;Lkotlin/Pair;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class taiyuan implements Comparator<Pair<? extends supplicat.taiyuan, ? extends List<SemanticsNode>>> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final taiyuan f7235kowloon = new taiyuan();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<supplicat.taiyuan, ? extends List<SemanticsNode>> a, Pair<supplicat.taiyuan, ? extends List<SemanticsNode>> b) {
            int iCompare = Float.compare(a.getFirst().getTop(), b.getFirst().getTop());
            return iCompare != 0 ? iCompare : Float.compare(a.getFirst().getBottom(), b.getFirst().getBottom());
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.polloi
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.overspeculate(this.f7485kowloon, z);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.molybdenite
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.microchemistry(this.f7472attabal, z);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new marial();
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new androidx.collection.yemenite<>(0, 1, null);
        this.pendingVerticalScrollEvents = new androidx.collection.yemenite<>(0, 1, null);
        this.actionIdToLabel = new androidx.collection.overspeculate<>(0, 1, null);
        this.labelToActionId = new androidx.collection.overspeculate<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new androidx.collection.saneness<>(0, 1, null);
        this.boundsUpdateChannel = kotlinx.coroutines.channels.competently.saneness(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = androidx.collection.arytenoidectomy.attabal();
        this.paneDisplayed = new androidx.collection.sealless(0, 1, null);
        this.idToBeforeMap = new androidx.collection.trm(0, 1, null);
        this.idToAfterMap = new androidx.collection.trm(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new cultivated.taiyuan();
        this.previousSemanticsNodes = androidx.collection.arytenoidectomy.saneness();
        this.previousSemanticsRoot = new lightstruck(androidComposeView.getSemanticsOwner().attabal(), androidx.collection.arytenoidectomy.attabal());
        androidComposeView.addOnAttachStateChangeListener(new attabal());
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.graveside
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.unconsolidated(this.f7435kowloon);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new Function1<palmyra, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(palmyra palmyraVar) {
                invoke2(palmyraVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(palmyra palmyraVar) {
                this.this$0.achondroplasia(palmyraVar);
            }
        };
    }

    public static final float gusty(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final boolean igbo(ScrollAxisRange scrollAxisRange, float f) {
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || scrollAxisRange.dern().invoke().floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && scrollAxisRange.dern().invoke().floatValue() < scrollAxisRange.attabal().invoke().floatValue();
        }
        return true;
    }

    public static final boolean lightstruck(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.dern().invoke().floatValue() >= scrollAxisRange.attabal().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.dern().invoke().floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    public static final void microchemistry(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean outmarry(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.technofreak(i, i2, num, list);
    }

    public static final void overspeculate(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = z ? androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1) : p002kotlin.collections.adultoid.formularize();
    }

    public static final boolean palmyra(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.dern().invoke().floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.dern().invoke().floatValue() < scrollAxisRange.attabal().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    public static final boolean prefect(ArrayList<Pair<supplicat.taiyuan, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.cutely().getTop();
        float bottom = semanticsNode.cutely().getBottom();
        boolean z = top >= bottom;
        int iTriweekly = p002kotlin.collections.adultoid.triweekly(arrayList);
        if (iTriweekly >= 0) {
            int i = 0;
            while (true) {
                supplicat.taiyuan first = arrayList.get(i).getFirst();
                boolean z2 = first.getTop() >= first.getBottom();
                if (!z && !z2 && Math.max(top, first.getTop()) < Math.min(bottom, first.getBottom())) {
                    arrayList.set(i, new Pair<>(first.apical(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i).getSecond()));
                    arrayList.get(i).getSecond().add(semanticsNode);
                    return true;
                }
                if (i != iTriweekly) {
                    i++;
                }
            }
        }
        return false;
    }

    public static final int tectonization(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final void unconsolidated(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            androidx.compose.ui.node.peridotite.saneness(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Unit unit = Unit.f29295attabal;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.creditor();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void achondroplasia(final palmyra scrollObservationScope) {
        if (scrollObservationScope.oilcan()) {
            this.view.getSnapshotObserver().taiyuan(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode;
                    ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
                    Float oldXValue = scrollObservationScope.getOldXValue();
                    Float oldYValue = scrollObservationScope.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.dern().invoke().floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.dern().invoke().floatValue() - oldYValue.floatValue();
                    if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fFloatValue2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        int iClaque = this.claque(scrollObservationScope.getSemanticsNodeId());
                        monroe monroeVar = (monroe) this.cultivated().dern(this.focusedVirtualViewId);
                        if (monroeVar != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                outmarry.rotuma rotumaVar = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                                if (rotumaVar != null) {
                                    rotumaVar.coi(androidComposeViewAccessibilityDelegateCompat.seminary(monroeVar));
                                    Unit unit = Unit.f29295attabal;
                                }
                            } catch (IllegalStateException unused) {
                                Unit unit2 = Unit.f29295attabal;
                            }
                        }
                        this.getView().invalidate();
                        monroe monroeVar2 = (monroe) this.cultivated().dern(iClaque);
                        if (monroeVar2 != null && (semanticsNode = monroeVar2.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            if (horizontalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat2.pendingHorizontalScrollEvents.molybdenite(iClaque, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat2.pendingVerticalScrollEvents.molybdenite(iClaque, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat2.sensatory(layoutNode);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        scrollObservationScope.competently(horizontalScrollAxisRange.dern().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        scrollObservationScope.impromptu(verticalScrollAxisRange.dern().invoke());
                    }
                }
            });
        }
    }

    public final void attendance(LayoutNode layoutNode) {
        if (layoutNode.picketboat() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRangeDern = this.pendingHorizontalScrollEvents.dern(semanticsId);
            ScrollAxisRange scrollAxisRangeDern2 = this.pendingVerticalScrollEvents.dern(semanticsId);
            if (scrollAxisRangeDern == null && scrollAxisRangeDern2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventHydrovane = hydrovane(semanticsId, 4096);
            if (scrollAxisRangeDern != null) {
                accessibilityEventHydrovane.setScrollX((int) scrollAxisRangeDern.dern().invoke().floatValue());
                accessibilityEventHydrovane.setMaxScrollX((int) scrollAxisRangeDern.attabal().invoke().floatValue());
            }
            if (scrollAxisRangeDern2 != null) {
                accessibilityEventHydrovane.setScrollY((int) scrollAxisRangeDern2.dern().invoke().floatValue());
                accessibilityEventHydrovane.setMaxScrollY((int) scrollAxisRangeDern2.attabal().invoke().floatValue());
            }
            herdbook(accessibilityEventHydrovane);
        }
    }

    public final List<SemanticsNode> basify(boolean layoutIsRtl, ArrayList<SemanticsNode> parentListToSort, androidx.collection.yemenite<List<SemanticsNode>> containerChildrenMapping) {
        ArrayList arrayList = new ArrayList();
        int iTriweekly = p002kotlin.collections.adultoid.triweekly(parentListToSort);
        int size = 0;
        if (iTriweekly >= 0) {
            int i = 0;
            while (true) {
                SemanticsNode semanticsNode = parentListToSort.get(i);
                if (i == 0 || !prefect(arrayList, semanticsNode)) {
                    arrayList.add(new Pair(semanticsNode.cutely(), p002kotlin.collections.adultoid.polloi(semanticsNode)));
                }
                if (i == iTriweekly) {
                    break;
                }
                i++;
            }
        }
        p002kotlin.collections.preprohormone.cuirassed(arrayList, taiyuan.f7235kowloon);
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            p002kotlin.collections.preprohormone.cuirassed((List) pair.getSecond(), new dovishness(new adultoid(layoutIsRtl ? impromptu.f7232kowloon : beachfront.f7223kowloon, LayoutNode.INSTANCE.attabal())));
            arrayList2.addAll((Collection) pair.getSecond());
        }
        final AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 androidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 = new Function2<SemanticsNode, SemanticsNode, Integer>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2
            @Override // p002kotlin.jvm.functions.Function2
            public final Integer invoke(SemanticsNode semanticsNode2, SemanticsNode semanticsNode3) {
                androidx.compose.ui.semantics.apical unmergedConfig = semanticsNode2.getUnmergedConfig();
                SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
                return Integer.valueOf(Float.compare(((Number) unmergedConfig.taiyuan(semanticsProperties.yemenite(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // p002kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                })).floatValue(), ((Number) semanticsNode3.getUnmergedConfig().taiyuan(semanticsProperties.yemenite(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // p002kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                })).floatValue()));
            }
        };
        p002kotlin.collections.preprohormone.cuirassed(arrayList2, new Comparator() { // from class: androidx.compose.ui.platform.monoploid
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AndroidComposeViewAccessibilityDelegateCompat.tectonization(androidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2, obj, obj2);
            }
        });
        while (size <= p002kotlin.collections.adultoid.triweekly(arrayList2)) {
            List<SemanticsNode> listDern = containerChildrenMapping.dern(((SemanticsNode) arrayList2.get(size)).getId());
            if (listDern != null) {
                if (coi((SemanticsNode) arrayList2.get(size))) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, listDern);
                size += listDern.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    public final int claque(int id) {
        if (id == this.view.getSemanticsOwner().attabal().getId()) {
            return -1;
        }
        return id;
    }

    public final void clubfoot(SemanticsNode currNode, ArrayList<SemanticsNode> geometryList, androidx.collection.yemenite<List<SemanticsNode>> containerMapToChildren) {
        boolean zFormularize = AndroidComposeViewAccessibilityDelegateCompat_androidKt.formularize(currNode);
        boolean zBooleanValue = ((Boolean) currNode.getUnmergedConfig().taiyuan(SemanticsProperties.f7561attabal.arytenoidectomy(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$geometryDepthFirstSearch$isTraversalGroup$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((zBooleanValue || coi(currNode)) && cultivated().saneness(currNode.getId())) {
            geometryList.add(currNode);
        }
        if (zBooleanValue) {
            containerMapToChildren.molybdenite(currNode.getId(), osteal(zFormularize, CollectionsKt.basify(currNode.apical())));
            return;
        }
        List<SemanticsNode> listApical = currNode.apical();
        int size = listApical.size();
        for (int i = 0; i < size; i++) {
            clubfoot(listApical.get(i), geometryList, containerMapToChildren);
        }
    }

    public final androidx.compose.ui.text.attabal coffeecake(androidx.compose.ui.semantics.apical apicalVar) {
        return (androidx.compose.ui.text.attabal) SemanticsConfigurationKt.attabal(apicalVar, SemanticsProperties.f7561attabal.competently());
    }

    public final boolean coi(SemanticsNode node) {
        List list = (List) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), SemanticsProperties.f7561attabal.wireman());
        return node.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (node.cuirassed() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || milliradian(node) != null || timberyard(node) != null || premeiotic(node)));
    }

    public final <T extends CharSequence> T cosy(T text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i = size - 1;
        if (Character.isHighSurrogate(text.charAt(i)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i;
        }
        T t = (T) text.subSequence(0, size);
        Intrinsics.competently(t, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t;
    }

    public final void creditor() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (empress()) {
                hardpan(this.view.getSemanticsOwner().attabal(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.f29295attabal;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                setterwort(cultivated());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    tarboosh();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final androidx.collection.kowloon<monroe> cultivated() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            Trace.beginSection("generateCurrentSemanticsNodes");
            try {
                androidx.collection.kowloon<monroe> kowloonVarSaneness = julian.saneness(this.view.getSemanticsOwner());
                Trace.endSection();
                this.currentSemanticsNodes = kowloonVarSaneness;
                if (empress()) {
                    Trace.beginSection("setTraversalValues");
                    try {
                        immediately();
                        Unit unit = Unit.f29295attabal;
                    } finally {
                        Trace.endSection();
                    }
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        return this.currentSemanticsNodes;
    }

    public final boolean czestochowa() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    public final void deadwork(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    public final int dent(SemanticsNode node) {
        androidx.compose.ui.semantics.apical unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        return (unmergedConfig.marial(semanticsProperties.wireman()) || !node.getUnmergedConfig().marial(semanticsProperties.stratoscope())) ? this.accessibilityCursorPosition : androidx.compose.ui.text.competently.competently(((androidx.compose.ui.text.competently) node.getUnmergedConfig().impromptu(semanticsProperties.stratoscope())).getPackedValue());
    }

    public final void dhss(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventHydrovane = hydrovane(claque(semanticsNodeId), 32);
        accessibilityEventHydrovane.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventHydrovane.getText().add(title);
        }
        herdbook(accessibilityEventHydrovane);
    }

    public final boolean empress() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty();
    }

    public final boolean fastrack(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        int iPermissivist;
        int i;
        int id = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String strTreadless = treadless(node);
        boolean z = false;
        if (strTreadless != null && strTreadless.length() != 0) {
            androidx.compose.ui.platform.beachfront beachfrontVarItchy = itchy(node, granularity);
            if (beachfrontVarItchy == null) {
                return false;
            }
            int iDent = dent(node);
            if (iDent == -1) {
                iDent = forward ? 0 : strTreadless.length();
            }
            int[] iArrAttabal = forward ? beachfrontVarItchy.attabal(iDent) : beachfrontVarItchy.saneness(iDent);
            if (iArrAttabal == null) {
                return false;
            }
            int i2 = iArrAttabal[0];
            z = true;
            int i3 = iArrAttabal[1];
            if (extendSelection && sayid(node)) {
                iPermissivist = permissivist(node);
                if (iPermissivist == -1) {
                    iPermissivist = forward ? i2 : i3;
                }
                i = forward ? i3 : i2;
            } else {
                iPermissivist = forward ? i3 : i2;
                i = iPermissivist;
            }
            this.pendingTextTraversedEvent = new competently(node, forward ? 256 : 512, granularity, i2, i3, SystemClock.uptimeMillis());
            homozygous(node, iPermissivist, i, true);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:56:0x00fa, B:27:0x0069, B:31:0x007c, B:33:0x0084, B:57:0x00ff, B:58:0x0102, B:20:0x0052, B:13:0x0035, B:55:0x00f8, B:34:0x008c, B:36:0x0092, B:38:0x009b, B:40:0x00ad, B:42:0x00b8, B:44:0x00bf, B:45:0x00c2, B:47:0x00c4, B:48:0x00c7, B:49:0x00c8, B:51:0x00cf, B:52:0x00d8), top: B:67:0x0023, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0092 A[Catch: all -> 0x003b, TryCatch #3 {all -> 0x003b, blocks: (B:13:0x0035, B:55:0x00f8, B:34:0x008c, B:36:0x0092, B:38:0x009b, B:40:0x00ad, B:42:0x00b8, B:44:0x00bf, B:45:0x00c2, B:47:0x00c4, B:48:0x00c7, B:49:0x00c8, B:51:0x00cf, B:52:0x00d8, B:39:0x00a8, B:41:0x00b5), top: B:70:0x0035, outer: #1, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #3 {all -> 0x003b, blocks: (B:13:0x0035, B:55:0x00f8, B:34:0x008c, B:36:0x0092, B:38:0x009b, B:40:0x00ad, B:42:0x00b8, B:44:0x00bf, B:45:0x00c2, B:47:0x00c4, B:48:0x00c7, B:49:0x00c8, B:51:0x00cf, B:52:0x00d8, B:39:0x00a8, B:41:0x00b5), top: B:70:0x0035, outer: #1, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf A[Catch: all -> 0x003b, TryCatch #3 {all -> 0x003b, blocks: (B:13:0x0035, B:55:0x00f8, B:34:0x008c, B:36:0x0092, B:38:0x009b, B:40:0x00ad, B:42:0x00b8, B:44:0x00bf, B:45:0x00c2, B:47:0x00c4, B:48:0x00c7, B:49:0x00c8, B:51:0x00cf, B:52:0x00d8, B:39:0x00a8, B:41:0x00b5), top: B:70:0x0035, outer: #1, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
    
        if (kotlinx.coroutines.splinterproof.attabal(r8, r0) == r1) goto L54;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f5 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object grimness(wretchedly.dern<? super p002kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.grimness(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[LOOP:1: B:15:0x0054->B:28:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097 A[EDGE_INSN: B:42:0x0097->B:29:0x0097 BREAK  A[LOOP:1: B:15:0x0054->B:28:0x0094], SYNTHETIC] */
    public final void hardpan(SemanticsNode newNode, lightstruck oldNode) {
        androidx.collection.sealless seallessVarSaneness = androidx.collection.polloi.saneness();
        List<SemanticsNode> listGraveside = newNode.graveside();
        int size = listGraveside.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = listGraveside.get(i);
            if (cultivated().attabal(semanticsNode.getId())) {
                if (!oldNode.getChildren().attabal(semanticsNode.getId())) {
                    sensatory(newNode.getLayoutNode());
                    return;
                }
                seallessVarSaneness.beachfront(semanticsNode.getId());
            }
        }
        androidx.collection.sealless children = oldNode.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128 && !seallessVarSaneness.attabal(iArr[(i2 << 3) + i4])) {
                            sensatory(newNode.getLayoutNode());
                            return;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        List<SemanticsNode> listGraveside2 = newNode.graveside();
        int size2 = listGraveside2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            SemanticsNode semanticsNode2 = listGraveside2.get(i5);
            if (cultivated().attabal(semanticsNode2.getId())) {
                lightstruck lightstruckVarDern = this.previousSemanticsNodes.dern(semanticsNode2.getId());
                Intrinsics.beachfront(lightstruckVarDern);
                hardpan(semanticsNode2, lightstruckVarDern);
            }
        }
    }

    public final boolean herdbook(AccessibilityEvent event) {
        if (!empress()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    public final boolean homozygous(SemanticsNode node, int start, int end, boolean traversalMode) {
        String strTreadless;
        androidx.compose.ui.semantics.apical unmergedConfig = node.getUnmergedConfig();
        androidx.compose.ui.semantics.cutely cutelyVar = androidx.compose.ui.semantics.cutely.f7617attabal;
        if (unmergedConfig.marial(cutelyVar.dovishness()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(node)) {
            tetrahedral.triweekly triweeklyVar = (tetrahedral.triweekly) ((AccessibilityAction) node.getUnmergedConfig().impromptu(cutelyVar.dovishness())).attabal();
            if (triweeklyVar != null) {
                return ((Boolean) triweeklyVar.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
            return false;
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (strTreadless = treadless(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > strTreadless.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z = strTreadless.length() > 0;
        herdbook(mathsort(claque(node.getId()), z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(strTreadless.length()) : null, strTreadless));
        vesuvio(node.getId());
        return true;
    }

    public final AccessibilityEvent hydrovane(int virtualViewId, int eventType) {
        monroe monroeVarDern;
        Trace.beginSection("obtainAccessibilityEvent");
        try {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
            Trace.endSection();
            accessibilityEventObtain.setEnabled(true);
            accessibilityEventObtain.setClassName("android.view.View");
            Trace.beginSection("event.packageName");
            try {
                accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
                Unit unit = Unit.f29295attabal;
                Trace.endSection();
                Trace.beginSection("event.setSource");
                try {
                    accessibilityEventObtain.setSource(this.view, virtualViewId);
                    Trace.endSection();
                    if (empress() && (monroeVarDern = cultivated().dern(virtualViewId)) != null) {
                        accessibilityEventObtain.setPassword(monroeVarDern.getSemanticsNode().getUnmergedConfig().marial(SemanticsProperties.f7561attabal.graveside()));
                    }
                    return accessibilityEventObtain;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final void immediately() {
        this.idToBeforeMap.taiyuan();
        this.idToAfterMap.taiyuan();
        monroe monroeVarDern = cultivated().dern(-1);
        SemanticsNode semanticsNode = monroeVarDern != null ? monroeVarDern.getSemanticsNode() : null;
        Intrinsics.beachfront(semanticsNode);
        List<SemanticsNode> listOsteal = osteal(AndroidComposeViewAccessibilityDelegateCompat_androidKt.formularize(semanticsNode), p002kotlin.collections.adultoid.polloi(semanticsNode));
        int iTriweekly = p002kotlin.collections.adultoid.triweekly(listOsteal);
        int i = 1;
        if (1 > iTriweekly) {
            return;
        }
        while (true) {
            int id = listOsteal.get(i - 1).getId();
            int id2 = listOsteal.get(i).getId();
            this.idToBeforeMap.monoploid(id, id2);
            this.idToAfterMap.monoploid(id2, id);
            if (i == iTriweekly) {
                return;
            } else {
                i++;
            }
        }
    }

    public final androidx.compose.ui.platform.beachfront itchy(SemanticsNode node, int granularity) {
        String strTreadless;
        TextLayoutResult textLayoutResultMarial;
        if (node == null || (strTreadless = treadless(node)) == null || strTreadless.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            androidx.compose.ui.platform.saneness sanenessVarAttabal = androidx.compose.ui.platform.saneness.INSTANCE.attabal(this.view.getContext().getResources().getConfiguration().locale);
            sanenessVarAttabal.marial(strTreadless);
            return sanenessVarAttabal;
        }
        if (granularity == 2) {
            androidx.compose.ui.platform.competently competentlyVarAttabal = androidx.compose.ui.platform.competently.INSTANCE.attabal(this.view.getContext().getResources().getConfiguration().locale);
            competentlyVarAttabal.marial(strTreadless);
            return competentlyVarAttabal;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                androidx.compose.ui.platform.marial marialVarAttabal = androidx.compose.ui.platform.marial.INSTANCE.attabal();
                marialVarAttabal.marial(strTreadless);
                return marialVarAttabal;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!node.getUnmergedConfig().marial(androidx.compose.ui.semantics.cutely.f7617attabal.taiyuan()) || (textLayoutResultMarial = julian.marial(node.getUnmergedConfig())) == null) {
            return null;
        }
        if (granularity == 4) {
            androidx.compose.ui.platform.dern dernVarAttabal = androidx.compose.ui.platform.dern.INSTANCE.attabal();
            dernVarAttabal.cutely(strTreadless, textLayoutResultMarial);
            return dernVarAttabal;
        }
        wireman wiremanVarAttabal = wireman.INSTANCE.attabal();
        wiremanVarAttabal.cutely(strTreadless, textLayoutResultMarial, node);
        return wiremanVarAttabal;
    }

    public final boolean julian(int virtualViewId) {
        if (!czestochowa() || lotta(virtualViewId)) {
            return false;
        }
        int i = this.focusedVirtualViewId;
        if (i != Integer.MIN_VALUE) {
            outmarry(this, i, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        outmarry(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    public final void lampshade(SemanticsNode node, outmarry.rotuma info) {
        androidx.compose.ui.semantics.apical unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        if (unmergedConfig.marial(semanticsProperties.impromptu())) {
            info.palmyra(true);
            info.achondroplasia((CharSequence) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), semanticsProperties.impromptu()));
        }
    }

    /* JADX INFO: renamed from: lerp, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final void libyan(SemanticsNode node, outmarry.rotuma info) {
        info.sensatory(premeiotic(node));
    }

    public final SpannableString licking(androidx.compose.ui.text.attabal attabalVar) {
        return (SpannableString) cosy(cultivated.attabal.saneness(attabalVar, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), DefaultOggSeeker.MATCH_BYTE_RANGE);
    }

    public final boolean lotta(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12, types: [T, androidx.compose.ui.node.LayoutNode] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, androidx.compose.ui.node.LayoutNode] */
    public final void mastfed(LayoutNode layoutNode, androidx.collection.sealless subtreeChangedSemanticsNodesIds) {
        androidx.compose.ui.semantics.apical apicalVarPreprohormone;
        ?? Apical;
        if (layoutNode.picketboat() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int size = this.subtreeChangedLayoutNodes.size();
            for (int i = 0; i < size; i++) {
                if (julian.beachfront(this.subtreeChangedLayoutNodes.triweekly(i), layoutNode)) {
                    return;
                }
            }
            Trace.beginSection("GetSemanticsNode");
            try {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? Apical2 = layoutNode.getNodes().monoploid(androidx.compose.ui.node.saran.attabal(8)) ? layoutNode : AndroidComposeViewAccessibilityDelegateCompat_androidKt.apical(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$id$1$semanticsNode$1
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.getNodes().monoploid(androidx.compose.ui.node.saran.attabal(8)));
                    }
                });
                ref$ObjectRef.element = Apical2;
                if (Apical2 != 0 && (apicalVarPreprohormone = Apical2.preprohormone()) != null) {
                    if (!apicalVarPreprohormone.getIsMergingSemanticsOfDescendants() && (Apical = AndroidComposeViewAccessibilityDelegateCompat_androidKt.apical((LayoutNode) ref$ObjectRef.element, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$id$1$1
                        @Override // p002kotlin.jvm.functions.Function1
                        public final Boolean invoke(LayoutNode layoutNode2) {
                            androidx.compose.ui.semantics.apical apicalVarPreprohormone2 = layoutNode2.preprohormone();
                            boolean z = false;
                            if (apicalVarPreprohormone2 != null && apicalVarPreprohormone2.getIsMergingSemanticsOfDescendants()) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                    })) != 0) {
                        ref$ObjectRef.element = Apical;
                    }
                    LayoutNode layoutNode2 = (LayoutNode) ref$ObjectRef.element;
                    if (layoutNode2 == null) {
                        Trace.endSection();
                        return;
                    }
                    int semanticsId = layoutNode2.getSemanticsId();
                    Trace.endSection();
                    if (subtreeChangedSemanticsNodesIds.beachfront(semanticsId)) {
                        outmarry(this, claque(semanticsId), 2048, 1, null, 8, null);
                        return;
                    }
                    return;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final AccessibilityEvent mathsort(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventHydrovane = hydrovane(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventHydrovane.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventHydrovane.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventHydrovane.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventHydrovane.getText().add(text);
        }
        return accessibilityEventHydrovane;
    }

    public final androidx.compose.ui.text.attabal milliradian(SemanticsNode node) {
        androidx.compose.ui.text.attabal attabalVarCoffeecake = coffeecake(node.getUnmergedConfig());
        List list = (List) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), SemanticsProperties.f7561attabal.cuirassed());
        return attabalVarCoffeecake == null ? list != null ? (androidx.compose.ui.text.attabal) CollectionsKt.firstOrNull(list) : null : attabalVarCoffeecake;
    }

    public final void molet(SemanticsNode node, outmarry.rotuma info) {
        info.microchemistry(timberyard(node));
    }

    public final boolean monroe(int id, List<palmyra> oldScrollObservationScopes) {
        boolean z;
        palmyra palmyraVarAttabal = julian.attabal(oldScrollObservationScopes, id);
        if (palmyraVarAttabal != null) {
            z = false;
        } else {
            palmyra palmyraVar = new palmyra(id, this.scrollObservationScopes, null, null, null, null);
            z = true;
            palmyraVarAttabal = palmyraVar;
        }
        this.scrollObservationScopes.add(palmyraVarAttabal);
        return z;
    }

    public final int nosophobia(float x, float y) {
        androidx.compose.ui.node.seminary nodes;
        androidx.compose.ui.node.peridotite.saneness(this.view, false, 1, null);
        androidx.compose.ui.node.triweekly triweeklyVar = new androidx.compose.ui.node.triweekly();
        LayoutNode.sayid(this.view.getRoot(), supplicat.impromptu.attabal(x, y), triweeklyVar, false, false, 12, null);
        androidx.compose.ui.attabal.dern dernVar = (androidx.compose.ui.attabal.dern) CollectionsKt.picketboat(triweeklyVar);
        LayoutNode layoutNodeImpromptu = dernVar != null ? androidx.compose.ui.node.beachfront.impromptu(dernVar) : null;
        if (layoutNodeImpromptu != null && (nodes = layoutNodeImpromptu.getNodes()) != null && nodes.monoploid(androidx.compose.ui.node.saran.attabal(8)) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.impassible(androidx.compose.ui.semantics.triweekly.attabal(layoutNodeImpromptu, false)) && this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeImpromptu) == null) {
            return claque(layoutNodeImpromptu.getSemanticsId());
        }
        return Integer.MIN_VALUE;
    }

    public final List<SemanticsNode> osteal(boolean layoutIsRtl, List<SemanticsNode> listToSort) {
        androidx.collection.yemenite<List<SemanticsNode>> yemeniteVarSaneness = androidx.collection.arytenoidectomy.saneness();
        ArrayList<SemanticsNode> arrayList = new ArrayList<>();
        int size = listToSort.size();
        for (int i = 0; i < size; i++) {
            clubfoot(listToSort.get(i), arrayList, yemeniteVarSaneness);
        }
        return basify(layoutIsRtl, arrayList, yemeniteVarSaneness);
    }

    public final String peridotite(SemanticsNode node) {
        androidx.compose.ui.semantics.apical apicalVarTriweekly = node.attabal().triweekly();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        Collection collection2 = (Collection) SemanticsConfigurationKt.attabal(apicalVarTriweekly, semanticsProperties.wireman());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        Collection collection3 = (Collection) SemanticsConfigurationKt.attabal(apicalVarTriweekly, semanticsProperties.cuirassed());
        if (collection3 != null && !collection3.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.attabal(apicalVarTriweekly, semanticsProperties.competently());
        if (charSequence == null || charSequence.length() == 0) {
            return this.view.getContext().getResources().getString(yemenite.marial.state_empty);
        }
        return null;
    }

    public final int permissivist(SemanticsNode node) {
        androidx.compose.ui.semantics.apical unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        return (unmergedConfig.marial(semanticsProperties.wireman()) || !node.getUnmergedConfig().marial(semanticsProperties.stratoscope())) ? this.accessibilityCursorPosition : androidx.compose.ui.text.competently.cutely(((androidx.compose.ui.text.competently) node.getUnmergedConfig().impromptu(semanticsProperties.stratoscope())).getPackedValue());
    }

    /* JADX WARN: Code duplicated, block: B:124:0x034b  */
    public final void picketboat(int virtualViewId, outmarry.rotuma info, SemanticsNode semanticsNode) {
        View viewImpromptu;
        boolean z;
        boolean zBooleanValue;
        info.preterite("android.view.View");
        androidx.compose.ui.semantics.apical unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        if (unmergedConfig.marial(semanticsProperties.competently())) {
            info.preterite("android.widget.EditText");
        }
        if (semanticsNode.getUnmergedConfig().marial(semanticsProperties.cuirassed())) {
            info.preterite("android.widget.TextView");
        }
        androidx.compose.ui.semantics.impromptu impromptuVar = (androidx.compose.ui.semantics.impromptu) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties.dovishness());
        if (impromptuVar != null) {
            impromptuVar.getValue();
            if (semanticsNode.getIsFake() || semanticsNode.graveside().isEmpty()) {
                androidx.compose.ui.semantics.impromptu.Companion companion = androidx.compose.ui.semantics.impromptu.INSTANCE;
                if (androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), companion.competently())) {
                    info.sakeen(this.view.getContext().getResources().getString(yemenite.marial.tab));
                } else if (androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), companion.beachfront())) {
                    info.sakeen(this.view.getContext().getResources().getString(yemenite.marial.switch_role));
                } else {
                    String strTaiyuan = julian.taiyuan(impromptuVar.getValue());
                    if (!androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), companion.wireman()) || semanticsNode.cuirassed() || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.preterite(strTaiyuan);
                    }
                }
            }
            Unit unit = Unit.f29295attabal;
        }
        if (semanticsNode.getUnmergedConfig().marial(androidx.compose.ui.semantics.cutely.f7617attabal.gintrap())) {
            info.preterite("android.widget.EditText");
        }
        if (semanticsNode.getUnmergedConfig().marial(semanticsProperties.cuirassed())) {
            info.preterite("android.widget.TextView");
        }
        info.attendance(this.view.getContext().getPackageName());
        info.technofreak(julian.competently(semanticsNode));
        List<SemanticsNode> listGraveside = semanticsNode.graveside();
        int size = listGraveside.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = listGraveside.get(i);
            if (cultivated().attabal(semanticsNode2.getId())) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (semanticsNode2.getId() != -1) {
                    if (androidViewHolder != null) {
                        info.dern(androidViewHolder);
                    } else {
                        info.wireman(this.view, semanticsNode2.getId());
                    }
                }
            }
        }
        if (virtualViewId == this.focusedVirtualViewId) {
            info.nosophobia(true);
            info.saneness(outmarry.rotuma.attabal.f34805formularize);
        } else {
            info.nosophobia(false);
            info.saneness(outmarry.rotuma.attabal.f34796apical);
        }
        sakeen(semanticsNode, info);
        lampshade(semanticsNode, info);
        molet(semanticsNode, info);
        libyan(semanticsNode, info);
        androidx.compose.ui.semantics.apical unmergedConfig2 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.f7561attabal;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.attabal(unmergedConfig2, semanticsProperties2.oilcan());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                info.underbelly(true);
            } else if (toggleableState == ToggleableState.Off) {
                info.underbelly(false);
            }
            Unit unit2 = Unit.f29295attabal;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties2.rotuma());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (impromptuVar == null ? false : androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), androidx.compose.ui.semantics.impromptu.INSTANCE.competently())) {
                info.tectonization(zBooleanValue2);
            } else {
                info.underbelly(zBooleanValue2);
            }
            Unit unit3 = Unit.f29295attabal;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.graveside().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties2.wireman());
            info.picketboat(list != null ? (String) CollectionsKt.firstOrNull(list) : null);
        }
        String str = (String) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties2.cord());
        if (str != null) {
            SemanticsNode semanticsNodePolloi = semanticsNode;
            while (true) {
                if (semanticsNodePolloi == null) {
                    zBooleanValue = false;
                    break;
                }
                androidx.compose.ui.semantics.apical unmergedConfig3 = semanticsNodePolloi.getUnmergedConfig();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.f7595attabal;
                if (unmergedConfig3.marial(semanticsPropertiesAndroid.attabal())) {
                    zBooleanValue = ((Boolean) semanticsNodePolloi.getUnmergedConfig().impromptu(semanticsPropertiesAndroid.attabal())).booleanValue();
                    break;
                }
                semanticsNodePolloi = semanticsNodePolloi.polloi();
            }
            if (zBooleanValue) {
                info.demilitarize(str);
            }
        }
        androidx.compose.ui.semantics.apical unmergedConfig4 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.f7561attabal;
        if (((Unit) SemanticsConfigurationKt.attabal(unmergedConfig4, semanticsProperties3.cutely())) != null) {
            info.hardpan(true);
            Unit unit4 = Unit.f29295attabal;
        }
        info.deadwork(semanticsNode.getUnmergedConfig().marial(semanticsProperties3.graveside()));
        info.monroe(semanticsNode.getUnmergedConfig().marial(semanticsProperties3.triweekly()));
        Integer num = (Integer) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties3.polloi());
        info.setterwort(num != null ? num.intValue() : -1);
        info.julian(AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode));
        info.unconsolidated(semanticsNode.getUnmergedConfig().marial(semanticsProperties3.taiyuan()));
        if (info.starveling()) {
            info.claque(((Boolean) semanticsNode.getUnmergedConfig().impromptu(semanticsProperties3.taiyuan())).booleanValue());
            if (info.hydrovane()) {
                info.attabal(2);
            } else {
                info.attabal(1);
            }
        }
        info.sultanate(AndroidComposeViewAccessibilityDelegateCompat_androidKt.impassible(semanticsNode));
        androidx.compose.ui.semantics.beachfront beachfrontVar = (androidx.compose.ui.semantics.beachfront) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties3.monoploid());
        if (beachfrontVar != null) {
            int value = beachfrontVar.getValue();
            androidx.compose.ui.semantics.beachfront.Companion companion2 = androidx.compose.ui.semantics.beachfront.INSTANCE;
            info.dhss((androidx.compose.ui.semantics.beachfront.marial(value, companion2.saneness()) || !androidx.compose.ui.semantics.beachfront.marial(value, companion2.attabal())) ? 1 : 2);
            Unit unit5 = Unit.f29295attabal;
        }
        info.wostteth(false);
        androidx.compose.ui.semantics.apical unmergedConfig5 = semanticsNode.getUnmergedConfig();
        androidx.compose.ui.semantics.cutely cutelyVar = androidx.compose.ui.semantics.cutely.f7617attabal;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(unmergedConfig5, cutelyVar.cutely());
        if (accessibilityAction != null) {
            boolean zWireman = Intrinsics.wireman(SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties3.rotuma()), Boolean.TRUE);
            androidx.compose.ui.semantics.impromptu.Companion companion3 = androidx.compose.ui.semantics.impromptu.INSTANCE;
            if (impromptuVar == null ? false : androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), companion3.competently())) {
                z = true;
            } else if (impromptuVar == null ? false : androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), companion3.marial())) {
                z = true;
            } else {
                z = false;
            }
            info.wostteth(!z || (z && !zWireman));
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode) && info.grimness()) {
                info.saneness(new outmarry.rotuma.attabal(16, accessibilityAction.getLabel()));
            }
            Unit unit6 = Unit.f29295attabal;
        }
        info.vesuvio(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.formularize());
        if (accessibilityAction2 != null) {
            info.vesuvio(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode)) {
                info.saneness(new outmarry.rotuma.attabal(32, accessibilityAction2.getLabel()));
            }
            Unit unit7 = Unit.f29295attabal;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.dern());
        if (accessibilityAction3 != null) {
            info.saneness(new outmarry.rotuma.attabal(16384, accessibilityAction3.getLabel()));
            Unit unit8 = Unit.f29295attabal;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.gintrap());
            if (accessibilityAction4 != null) {
                info.saneness(new outmarry.rotuma.attabal(2097152, accessibilityAction4.getLabel()));
                Unit unit9 = Unit.f29295attabal;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.apical());
            if (accessibilityAction5 != null) {
                info.saneness(new outmarry.rotuma.attabal(R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                Unit unit10 = Unit.f29295attabal;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.marial());
            if (accessibilityAction6 != null) {
                info.saneness(new outmarry.rotuma.attabal(65536, accessibilityAction6.getLabel()));
                Unit unit11 = Unit.f29295attabal;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.monoploid());
            if (accessibilityAction7 != null) {
                if (info.hydrovane() && this.view.getClipboardManager().attabal()) {
                    info.saneness(new outmarry.rotuma.attabal(32768, accessibilityAction7.getLabel()));
                }
                Unit unit12 = Unit.f29295attabal;
            }
        }
        String strTreadless = treadless(semanticsNode);
        if (!(strTreadless == null || strTreadless.length() == 0)) {
            info.cosy(permissivist(semanticsNode), dent(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.dovishness());
            info.saneness(new outmarry.rotuma.attabal(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.attabal(256);
            info.attabal(512);
            info.mastfed(11);
            List list2 = (List) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties3.wireman());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig().marial(cutelyVar.taiyuan()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.cutely(semanticsNode)) {
                info.mastfed(info.rotuma() | 20);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("androidx.compose.ui.semantics.id");
            CharSequence charSequenceTrm = info.trm();
            if (!(charSequenceTrm == null || charSequenceTrm.length() == 0) && semanticsNode.getUnmergedConfig().marial(cutelyVar.taiyuan())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig().marial(semanticsProperties3.cord())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            info.lotta(arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties3.adultoid());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig().marial(cutelyVar.adultoid())) {
                info.preterite("android.widget.SeekBar");
            } else {
                info.preterite("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.attabal()) {
                info.molet(outmarry.rotuma.competently.attabal(1, progressBarRangeInfo.dern().wireman().floatValue(), progressBarRangeInfo.dern().marial().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig().marial(cutelyVar.adultoid()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode)) {
                if (progressBarRangeInfo.getCurrent() < p002kotlin.ranges.wireman.dern(progressBarRangeInfo.dern().marial().floatValue(), progressBarRangeInfo.dern().wireman().floatValue())) {
                    info.saneness(outmarry.rotuma.attabal.f34818monoploid);
                }
                if (progressBarRangeInfo.getCurrent() > p002kotlin.ranges.wireman.beachfront(progressBarRangeInfo.dern().wireman().floatValue(), progressBarRangeInfo.dern().marial().floatValue())) {
                    info.saneness(outmarry.rotuma.attabal.f34822polloi);
                }
            }
        }
        saneness.attabal(info, semanticsNode);
        CollectionInfo_androidKt.wireman(semanticsNode, info);
        CollectionInfo_androidKt.marial(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties3.apical());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.molybdenite());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.saneness(semanticsNode)) {
                info.preterite("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.attabal().invoke().floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                info.basify(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode)) {
                if (lightstruck(scrollAxisRange)) {
                    info.saneness(outmarry.rotuma.attabal.f34818monoploid);
                    info.saneness(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.formularize(semanticsNode) ? outmarry.rotuma.attabal.f34828sealless : outmarry.rotuma.attabal.f34819oilcan);
                }
                if (palmyra(scrollAxisRange)) {
                    info.saneness(outmarry.rotuma.attabal.f34822polloi);
                    info.saneness(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.formularize(semanticsNode) ? outmarry.rotuma.attabal.f34819oilcan : outmarry.rotuma.attabal.f34828sealless);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties3.sealless());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.saneness(semanticsNode)) {
                info.preterite("android.widget.ScrollView");
            }
            if (scrollAxisRange2.attabal().invoke().floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                info.basify(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode)) {
                if (lightstruck(scrollAxisRange2)) {
                    info.saneness(outmarry.rotuma.attabal.f34818monoploid);
                    info.saneness(outmarry.rotuma.attabal.f34838yemenite);
                }
                if (palmyra(scrollAxisRange2)) {
                    info.saneness(outmarry.rotuma.attabal.f34822polloi);
                    info.saneness(outmarry.rotuma.attabal.f34836trm);
                }
            }
        }
        if (i2 >= 29) {
            dern.attabal(info, semanticsNode);
        }
        info.homozygous((CharSequence) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties3.molybdenite()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.taiyuan(semanticsNode)) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.competently());
            if (accessibilityAction10 != null) {
                info.saneness(new outmarry.rotuma.attabal(Opcodes.ASM4, accessibilityAction10.getLabel()));
                Unit unit13 = Unit.f29295attabal;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.saneness());
            if (accessibilityAction11 != null) {
                info.saneness(new outmarry.rotuma.attabal(Opcodes.ASM8, accessibilityAction11.getLabel()));
                Unit unit14 = Unit.f29295attabal;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), cutelyVar.beachfront());
            if (accessibilityAction12 != null) {
                info.saneness(new outmarry.rotuma.attabal(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, accessibilityAction12.getLabel()));
                Unit unit15 = Unit.f29295attabal;
            }
            if (semanticsNode.getUnmergedConfig().marial(cutelyVar.wireman())) {
                List list3 = (List) semanticsNode.getUnmergedConfig().impromptu(cutelyVar.wireman());
                int size2 = list3.size();
                androidx.collection.impassible impassibleVar = f7184starveling;
                if (size2 >= impassibleVar.get_size()) {
                    throw new IllegalStateException("Can't have more than " + impassibleVar.get_size() + " custom actions for one widget");
                }
                androidx.collection.overspeculate<CharSequence> overspeculateVar = new androidx.collection.overspeculate<>(0, 1, null);
                androidx.collection.polder<CharSequence> polderVarSaneness = androidx.collection.starveling.saneness();
                if (this.labelToActionId.marial(virtualViewId)) {
                    androidx.collection.polder<CharSequence> polderVarBeachfront = this.labelToActionId.beachfront(virtualViewId);
                    androidx.collection.oilcan oilcanVar = new androidx.collection.oilcan(0, 1, null);
                    int[] iArr = impassibleVar.content;
                    int i3 = impassibleVar._size;
                    for (int i4 = 0; i4 < i3; i4++) {
                        oilcanVar.impromptu(iArr[i4]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i5);
                        Intrinsics.beachfront(polderVarBeachfront);
                        if (polderVarBeachfront.attabal(customAccessibilityAction.getLabel())) {
                            int iWireman = polderVarBeachfront.wireman(customAccessibilityAction.getLabel());
                            overspeculateVar.apical(iWireman, customAccessibilityAction.getLabel());
                            polderVarSaneness.graveside(customAccessibilityAction.getLabel(), iWireman);
                            oilcanVar.apical(iWireman);
                            info.saneness(new outmarry.rotuma.attabal(iWireman, customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i6);
                        int iSaneness = oilcanVar.saneness(i6);
                        overspeculateVar.apical(iSaneness, customAccessibilityAction2.getLabel());
                        polderVarSaneness.graveside(customAccessibilityAction2.getLabel(), iSaneness);
                        info.saneness(new outmarry.rotuma.attabal(iSaneness, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i7);
                        int iSaneness2 = f7184starveling.saneness(i7);
                        overspeculateVar.apical(iSaneness2, customAccessibilityAction3.getLabel());
                        polderVarSaneness.graveside(customAccessibilityAction3.getLabel(), iSaneness2);
                        info.saneness(new outmarry.rotuma.attabal(iSaneness2, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.apical(virtualViewId, overspeculateVar);
                this.labelToActionId.apical(virtualViewId, polderVarSaneness);
            }
        }
        info.immediately(coi(semanticsNode));
        int iMarial = this.idToBeforeMap.marial(virtualViewId, -1);
        if (iMarial != -1) {
            View viewImpromptu2 = julian.impromptu(this.view.getAndroidViewsHandler$ui_release(), iMarial);
            if (viewImpromptu2 != null) {
                info.tarboosh(viewImpromptu2);
            } else {
                info.cig(this.view, iMarial);
            }
            polder(virtualViewId, info, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int iMarial2 = this.idToAfterMap.marial(virtualViewId, -1);
        if (iMarial2 == -1 || (viewImpromptu = julian.impromptu(this.view.getAndroidViewsHandler$ui_release(), iMarial2)) == null) {
            return;
        }
        info.pruinose(viewImpromptu);
        polder(virtualViewId, info, this.ExtraDataTestTraversalAfterVal, null);
    }

    public final void polder(int virtualViewId, outmarry.rotuma info, String extraDataKey, Bundle arguments) {
        SemanticsNode semanticsNode;
        TextLayoutResult textLayoutResultMarial;
        monroe monroeVarDern = cultivated().dern(virtualViewId);
        if (monroeVarDern == null || (semanticsNode = monroeVarDern.getSemanticsNode()) == null) {
            return;
        }
        String strTreadless = treadless(semanticsNode);
        if (Intrinsics.wireman(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            int iMarial = this.idToBeforeMap.marial(virtualViewId, -1);
            if (iMarial != -1) {
                info.dovishness().putInt(extraDataKey, iMarial);
                return;
            }
            return;
        }
        if (Intrinsics.wireman(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            int iMarial2 = this.idToAfterMap.marial(virtualViewId, -1);
            if (iMarial2 != -1) {
                info.dovishness().putInt(extraDataKey, iMarial2);
                return;
            }
            return;
        }
        if (semanticsNode.getUnmergedConfig().marial(androidx.compose.ui.semantics.cutely.f7617attabal.taiyuan()) && arguments != null && Intrinsics.wireman(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i2 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i2 <= 0 || i < 0) {
                return;
            }
            if (i < (strTreadless != null ? strTreadless.length() : Integer.MAX_VALUE) && (textLayoutResultMarial = julian.marial(semanticsNode.getUnmergedConfig())) != null) {
                ArrayList arrayList = new ArrayList();
                if (i2 <= 0) {
                    info.dovishness().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                } else {
                    textLayoutResultMarial.dern();
                    throw null;
                }
            }
            return;
        }
        androidx.compose.ui.semantics.apical unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        if (!unmergedConfig.marial(semanticsProperties.cord()) || arguments == null || !Intrinsics.wireman(extraDataKey, "androidx.compose.ui.semantics.testTag")) {
            if (Intrinsics.wireman(extraDataKey, "androidx.compose.ui.semantics.id")) {
                info.dovishness().putInt(extraDataKey, semanticsNode.getId());
            }
        } else {
            String str = (String) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties.cord());
            if (str != null) {
                info.dovishness().putCharSequence(extraDataKey, str);
            }
        }
    }

    public final boolean premeiotic(SemanticsNode node) {
        androidx.compose.ui.semantics.apical unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.attabal(unmergedConfig, semanticsProperties.oilcan());
        androidx.compose.ui.semantics.impromptu impromptuVar = (androidx.compose.ui.semantics.impromptu) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), semanticsProperties.dovishness());
        boolean z = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), semanticsProperties.rotuma())) != null) {
            if (!(impromptuVar != null ? androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), androidx.compose.ui.semantics.impromptu.INSTANCE.competently()) : false)) {
                return true;
            }
        }
        return z;
    }

    public final void preterite() {
        this.currentSemanticsNodesInvalidated = true;
        if (!empress() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    public final boolean privatdozent(androidx.collection.kowloon<monroe> currentSemanticsNodes, boolean vertical, int direction, long position) {
        SemanticsPropertyKey<ScrollAxisRange> semanticsPropertyKeyApical;
        ScrollAxisRange scrollAxisRange;
        if (supplicat.competently.taiyuan(position, supplicat.competently.INSTANCE.saneness()) || !supplicat.competently.triweekly(position)) {
            return false;
        }
        if (vertical) {
            semanticsPropertyKeyApical = SemanticsProperties.f7561attabal.sealless();
        } else {
            if (vertical) {
                throw new NoWhenBranchMatchedException();
            }
            semanticsPropertyKeyApical = SemanticsProperties.f7561attabal.apical();
        }
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr = currentSemanticsNodes.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((j & 255) < 128) {
                        monroe monroeVar = (monroe) objArr[(i << 3) + i3];
                        if (restrictive.czestochowa.marial(monroeVar.getAdjustedBounds()).saneness(position) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.attabal(monroeVar.getSemanticsNode().getUnmergedConfig(), semanticsPropertyKeyApical)) != null) {
                            int i4 = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                            if (direction == 0 && scrollAxisRange.getReverseScrolling()) {
                                i4 = -1;
                            }
                            if (i4 < 0) {
                                if (scrollAxisRange.dern().invoke().floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    z = true;
                                }
                            } else if (scrollAxisRange.dern().invoke().floatValue() < scrollAxisRange.attabal().invoke().floatValue()) {
                                z = true;
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    public final void pruinose(int virtualViewId) {
        int i = this.hoveredVirtualViewId;
        if (i == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        outmarry(this, virtualViewId, 128, null, null, 12, null);
        outmarry(this, i, 256, null, null, 12, null);
    }

    public final void sakeen(SemanticsNode node, outmarry.rotuma info) {
        androidx.compose.ui.text.attabal attabalVarMilliradian = milliradian(node);
        info.fastrack(attabalVarMilliradian != null ? licking(attabalVarMilliradian) : null);
    }

    @Override // androidx.core.view.attabal
    public outmarry.preprohormone saneness(View host) {
        return this.nodeProvider;
    }

    public final boolean saran(boolean vertical, int direction, long position) {
        if (Intrinsics.wireman(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return privatdozent(cultivated(), vertical, direction, position);
        }
        return false;
    }

    public final boolean sayid(SemanticsNode node) {
        androidx.compose.ui.semantics.apical unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        return !unmergedConfig.marial(semanticsProperties.wireman()) && node.getUnmergedConfig().marial(semanticsProperties.competently());
    }

    public final Rect seminary(monroe node) {
        Rect adjustedBounds = node.getAdjustedBounds();
        long jGraveside = this.view.graveside(supplicat.impromptu.attabal(adjustedBounds.left, adjustedBounds.top));
        long jGraveside2 = this.view.graveside(supplicat.impromptu.attabal(adjustedBounds.right, adjustedBounds.bottom));
        return new Rect((int) Math.floor(supplicat.competently.apical(jGraveside)), (int) Math.floor(supplicat.competently.formularize(jGraveside)), (int) Math.ceil(supplicat.competently.apical(jGraveside2)), (int) Math.ceil(supplicat.competently.formularize(jGraveside2)));
    }

    public final void sensatory(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.triweekly(Unit.f29295attabal);
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0530  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final void setterwort(androidx.collection.kowloon<androidx.compose.ui.platform.monroe> r39) {
        /*
            Method dump skipped, instruction units count: 1530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.setterwort(androidx.collection.kowloon):void");
    }

    public final boolean splinterproof(MotionEvent event) {
        if (!czestochowa()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int iNosophobia = nosophobia(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            pruinose(iNosophobia);
            if (iNosophobia == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        pruinose(Integer.MIN_VALUE);
        return true;
    }

    public final boolean starveling(int virtualViewId) {
        if (!lotta(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyFocusedANI = null;
        this.view.invalidate();
        outmarry(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0150 A[LOOP:2: B:39:0x00da->B:54:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0159 A[EDGE_INSN: B:64:0x0159->B:55:0x0159 BREAK  A[LOOP:2: B:39:0x00da->B:54:0x0150], SYNTHETIC] */
    public final void tarboosh() {
        long j;
        long j2;
        long j3;
        long j4;
        androidx.compose.ui.semantics.apical unmergedConfig;
        androidx.collection.sealless seallessVar = new androidx.collection.sealless(0, 1, null);
        androidx.collection.sealless seallessVar2 = this.paneDisplayed;
        int[] iArr = seallessVar2.elements;
        long[] jArr = seallessVar2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        long j5 = 128;
        long j6 = 255;
        char c = 7;
        long j7 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j8 = jArr[i];
                int[] iArr2 = iArr;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j8 & j6) < j5) {
                            j3 = j5;
                            int i4 = iArr2[(i << 3) + i3];
                            monroe monroeVarDern = cultivated().dern(i4);
                            SemanticsNode semanticsNode = monroeVarDern != null ? monroeVarDern.getSemanticsNode() : null;
                            if (semanticsNode != null) {
                                j4 = j6;
                                if (!semanticsNode.getUnmergedConfig().marial(SemanticsProperties.f7561attabal.molybdenite())) {
                                }
                            } else {
                                j4 = j6;
                            }
                            seallessVar.beachfront(i4);
                            lightstruck lightstruckVarDern = this.previousSemanticsNodes.dern(i4);
                            dhss(i4, 32, (lightstruckVarDern == null || (unmergedConfig = lightstruckVarDern.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.attabal(unmergedConfig, SemanticsProperties.f7561attabal.molybdenite()));
                        } else {
                            j3 = j5;
                            j4 = j6;
                        }
                        j8 >>= 8;
                        i3++;
                        j5 = j3;
                        j6 = j4;
                    }
                    j = j5;
                    j2 = j6;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    j = j5;
                    j2 = j6;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr = iArr2;
                j5 = j;
                j6 = j2;
            }
        } else {
            j = 128;
            j2 = 255;
        }
        this.paneDisplayed.polloi(seallessVar);
        this.previousSemanticsNodes.taiyuan();
        androidx.collection.kowloon<monroe> kowloonVarCultivated = cultivated();
        int[] iArr3 = kowloonVarCultivated.keys;
        Object[] objArr = kowloonVarCultivated.values;
        long[] jArr2 = kowloonVarCultivated.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                long j9 = jArr2[i5];
                if ((((~j9) << c) & j9 & j7) != j7) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j9 & j2) < j) {
                            int i8 = (i5 << 3) + i7;
                            int i9 = iArr3[i8];
                            monroe monroeVar = (monroe) objArr[i8];
                            androidx.compose.ui.semantics.apical unmergedConfig2 = monroeVar.getSemanticsNode().getUnmergedConfig();
                            SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
                            if (unmergedConfig2.marial(semanticsProperties.molybdenite()) && this.paneDisplayed.beachfront(i9)) {
                                dhss(i9, 16, (String) monroeVar.getSemanticsNode().getUnmergedConfig().impromptu(semanticsProperties.molybdenite()));
                            }
                            this.previousSemanticsNodes.molybdenite(i9, new lightstruck(monroeVar.getSemanticsNode(), cultivated()));
                        }
                        j9 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                    if (i5 != length2) {
                        break;
                    }
                    i5++;
                    c = 7;
                    j7 = -9187201950435737472L;
                } else if (i5 != length2) {
                    break;
                    break;
                } else {
                    i5++;
                    c = 7;
                    j7 = -9187201950435737472L;
                }
            }
        }
        this.previousSemanticsRoot = new lightstruck(this.view.getSemanticsOwner().attabal(), cultivated());
    }

    public final boolean technofreak(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !empress()) {
            return false;
        }
        AccessibilityEvent accessibilityEventHydrovane = hydrovane(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventHydrovane.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventHydrovane.setContentDescription(itchy.attabal.wireman(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        Trace.beginSection("sendEvent");
        try {
            return herdbook(accessibilityEventHydrovane);
        } finally {
            Trace.endSection();
        }
    }

    public final String timberyard(SemanticsNode node) {
        androidx.compose.ui.semantics.apical unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        Object objAttabal = SemanticsConfigurationKt.attabal(unmergedConfig, semanticsProperties.preprohormone());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), semanticsProperties.oilcan());
        androidx.compose.ui.semantics.impromptu impromptuVar = (androidx.compose.ui.semantics.impromptu) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), semanticsProperties.dovishness());
        int iApical = 0;
        if (toggleableState != null) {
            int i = cutely.f7230attabal[toggleableState.ordinal()];
            if (i == 1) {
                if ((impromptuVar == null ? false : androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), androidx.compose.ui.semantics.impromptu.INSTANCE.beachfront())) && objAttabal == null) {
                    objAttabal = this.view.getContext().getResources().getString(yemenite.marial.state_on);
                }
            } else if (i == 2) {
                if ((impromptuVar == null ? false : androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), androidx.compose.ui.semantics.impromptu.INSTANCE.beachfront())) && objAttabal == null) {
                    objAttabal = this.view.getContext().getResources().getString(yemenite.marial.state_off);
                }
            } else if (i == 3 && objAttabal == null) {
                objAttabal = this.view.getContext().getResources().getString(yemenite.marial.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), semanticsProperties.rotuma());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(impromptuVar == null ? false : androidx.compose.ui.semantics.impromptu.apical(impromptuVar.getValue(), androidx.compose.ui.semantics.impromptu.INSTANCE.competently())) && objAttabal == null) {
                objAttabal = zBooleanValue ? this.view.getContext().getResources().getString(yemenite.marial.selected) : this.view.getContext().getResources().getString(yemenite.marial.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), semanticsProperties.adultoid());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.attabal()) {
                if (objAttabal == null) {
                    co.saneness<Float> sanenessVarDern = progressBarRangeInfo.dern();
                    float current = ((sanenessVarDern.marial().floatValue() - sanenessVarDern.wireman().floatValue()) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : ((sanenessVarDern.marial().floatValue() - sanenessVarDern.wireman().floatValue()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - sanenessVarDern.wireman().floatValue()) / (sanenessVarDern.marial().floatValue() - sanenessVarDern.wireman().floatValue());
                    if (current < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (!(current == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        iApical = (current == 1.0f ? 1 : 0) != 0 ? 100 : p002kotlin.ranges.wireman.apical(Math.round(current * 100), 1, 99);
                    }
                    objAttabal = this.view.getContext().getResources().getString(yemenite.marial.template_percent, Integer.valueOf(iApical));
                }
            } else if (objAttabal == null) {
                objAttabal = this.view.getContext().getResources().getString(yemenite.marial.in_progress);
            }
        }
        if (node.getUnmergedConfig().marial(semanticsProperties.competently())) {
            objAttabal = peridotite(node);
        }
        return (String) objAttabal;
    }

    public final String treadless(SemanticsNode node) {
        androidx.compose.ui.text.attabal attabalVar;
        if (node == null) {
            return null;
        }
        androidx.compose.ui.semantics.apical unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        if (unmergedConfig.marial(semanticsProperties.wireman())) {
            return itchy.attabal.wireman((List) node.getUnmergedConfig().impromptu(semanticsProperties.wireman()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().marial(semanticsProperties.competently())) {
            androidx.compose.ui.text.attabal attabalVarCoffeecake = coffeecake(node.getUnmergedConfig());
            if (attabalVarCoffeecake != null) {
                return attabalVarCoffeecake.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.attabal(node.getUnmergedConfig(), semanticsProperties.cuirassed());
        if (list == null || (attabalVar = (androidx.compose.ui.text.attabal) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return attabalVar.getText();
    }

    public final void underbelly(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (empress()) {
            sensatory(layoutNode);
        }
    }

    public final void vesuvio(int semanticsNodeId) {
        competently competentlyVar = this.pendingTextTraversedEvent;
        if (competentlyVar != null) {
            if (semanticsNodeId != competentlyVar.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - competentlyVar.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventHydrovane = hydrovane(claque(competentlyVar.getNode().getId()), 131072);
                accessibilityEventHydrovane.setFromIndex(competentlyVar.getFromIndex());
                accessibilityEventHydrovane.setToIndex(competentlyVar.getToIndex());
                accessibilityEventHydrovane.setAction(competentlyVar.getAction());
                accessibilityEventHydrovane.setMovementGranularity(competentlyVar.getGranularity());
                accessibilityEventHydrovane.getText().add(treadless(competentlyVar.getNode()));
                herdbook(accessibilityEventHydrovane);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final outmarry.rotuma walach(int virtualViewId) {
        androidx.p001lifecycle.arytenoidectomy lifecycleOwner;
        Lifecycle lifecycle;
        Trace.beginSection("checkIfDestroyed");
        try {
            AndroidComposeView.saneness viewTreeOwners = this.view.getViewTreeOwners();
            if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == Lifecycle.State.DESTROYED) {
                Trace.endSection();
                return null;
            }
            Unit unit = Unit.f29295attabal;
            Trace.endSection();
            Trace.beginSection("createAccessibilityNodeInfoObject");
            try {
                outmarry.rotuma rotumaVarPremeiotic = outmarry.rotuma.premeiotic();
                Trace.endSection();
                Trace.beginSection("calculateNodeWithAdjustedBounds");
                try {
                    monroe monroeVarDern = cultivated().dern(virtualViewId);
                    Trace.endSection();
                    if (monroeVarDern == null) {
                        return null;
                    }
                    SemanticsNode semanticsNode = monroeVarDern.getSemanticsNode();
                    Trace.beginSection("setParentForAccessibility");
                    int i = -1;
                    try {
                        if (virtualViewId == -1) {
                            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
                            rotumaVarPremeiotic.lampshade(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
                        } else {
                            SemanticsNode semanticsNodePolloi = semanticsNode.polloi();
                            Integer numValueOf = semanticsNodePolloi != null ? Integer.valueOf(semanticsNodePolloi.getId()) : null;
                            if (numValueOf == null) {
                                peridotite.attabal.dern("semanticsNode " + virtualViewId + " has null parent");
                                throw new KotlinNothingValueException();
                            }
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != this.view.getSemanticsOwner().attabal().getId()) {
                                i = iIntValue;
                            }
                            rotumaVarPremeiotic.libyan(this.view, i);
                        }
                        Trace.endSection();
                        rotumaVarPremeiotic.licking(this.view, virtualViewId);
                        Trace.beginSection("setBoundsInScreen");
                        try {
                            rotumaVarPremeiotic.coi(seminary(monroeVarDern));
                            Trace.endSection();
                            Trace.beginSection("populateAccessibilityNodeInfoProperties");
                            try {
                                picketboat(virtualViewId, rotumaVarPremeiotic, semanticsNode);
                                return rotumaVarPremeiotic;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01b3 -> B:97:0x01b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:97:0x01b4
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean wostteth(int r20, int r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 1878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.wostteth(int, int, android.os.Bundle):boolean");
    }
}
