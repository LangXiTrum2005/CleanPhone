package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.A5;
import com.ironsource.C3414a2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.ranges.wireman;
import p002kotlin.sequences.Sequence;
import p002kotlin.text.impassible;
import patroclinal.formularize;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Collections.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001d\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0018\u0010\n\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u0007\u001a\u001d\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001a\u0010\n\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001b\u0010\u0007\u001a\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001c\u0010\n\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b \u0010!\u001a=\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\"H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a)\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020&*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b'\u0010(\u001a=\u0010,\u001a\u00028\u0000\"\u0010\b\u0000\u0010**\n\u0012\u0006\b\u0000\u0012\u00028\u00010)\"\b\b\u0001\u0010\u0000*\u00020&*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010+\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-\u001a+\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b2\u0010\u001f\u001a+\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b3\u0010!\u001a-\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000004*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b5\u0010(\u001a?\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00108\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000006j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`7¢\u0006\u0004\b9\u0010:\u001a\u0017\u0010=\u001a\u00020<*\b\u0012\u0004\u0012\u00020\u00030;¢\u0006\u0004\b=\u0010>\u001a\u0017\u0010@\u001a\u00020?*\b\u0012\u0004\u0012\u00020\r0;¢\u0006\u0004\b@\u0010A\u001a\u0017\u0010D\u001a\u00020C*\b\u0012\u0004\u0012\u00020B0;¢\u0006\u0004\bD\u0010E\u001a7\u0010F\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010**\n\u0012\u0006\b\u0000\u0012\u00028\u00000)*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010+\u001a\u00028\u0001¢\u0006\u0004\bF\u0010-\u001a-\u0010I\u001a\u0012\u0012\u0004\u0012\u00028\u00000Gj\b\u0012\u0004\u0012\u00028\u0000`H\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bI\u0010J\u001a#\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bK\u0010(\u001a#\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bM\u0010(\u001a#\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000L\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;¢\u0006\u0004\bN\u0010O\u001a#\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000P\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bQ\u0010R\u001aC\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010S*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0086\bø\u0001\u0000¢\u0006\u0004\bU\u0010%\u001a)\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000V0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bW\u0010X\u001a#\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bY\u0010(\u001a4\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000P\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\b[\u0010\\\u001a#\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b^\u0010R\u001a4\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000P\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\b_\u0010\\\u001a7\u0010`\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\"H\u0086\bø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a+\u0010b\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000004*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bb\u0010c\u001a.\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bd\u0010e\u001a.\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bf\u0010e\u001a.\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bg\u0010h\u001a4\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\bj\u0010k\u001a4\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\bl\u0010m\u001aF\u0010o\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010n0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010S*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\bo\u0010k\u001a}\u0010z\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010r*\u00060pj\u0002`q*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010s\u001a\u00028\u00012\b\b\u0002\u0010u\u001a\u00020t2\b\b\u0002\u0010v\u001a\u00020t2\b\b\u0002\u0010w\u001a\u00020t2\b\b\u0002\u0010x\u001a\u00020\r2\b\b\u0002\u0010y\u001a\u00020t2\u0016\b\u0002\u0010T\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020t\u0018\u00010\"¢\u0006\u0004\bz\u0010{\u001ag\u0010}\u001a\u00020|\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010u\u001a\u00020t2\b\b\u0002\u0010v\u001a\u00020t2\b\b\u0002\u0010w\u001a\u00020t2\b\b\u0002\u0010x\u001a\u00020\r2\b\b\u0002\u0010y\u001a\u00020t2\u0016\b\u0002\u0010T\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020t\u0018\u00010\"¢\u0006\u0004\b}\u0010~\u001a&\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u001e\u0010\u0084\u0001\u001a\u00030\u0083\u0001*\t\u0012\u0005\u0012\u00030\u0082\u00010\u0001H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0086\u0001"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "element", "", "permissivist", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "coffeecake", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "lerp", "(Ljava/util/List;)Ljava/lang/Object;", "nosophobia", "firstOrNull", "", "index", "lotta", "(Ljava/util/List;I)Ljava/lang/Object;", "sayid", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "empress", "(Ljava/util/List;Ljava/lang/Object;)I", "wostteth", "igbo", "gusty", "picketboat", "hardpan", "herdbook", "technofreak", "outmarry", A5.q, "premeiotic", "(Ljava/lang/Iterable;I)Ljava/util/List;", "timberyard", "(Ljava/util/List;I)Ljava/util/List;", "Lkotlin/Function1;", "predicate", "milliradian", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "treadless", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "C", "destination", "itchy", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "dhss", "(Ljava/util/List;Lkotlin/ranges/IntRange;)Ljava/util/List;", "mastfed", "attendance", "", "vesuvio", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "setterwort", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "", "homozygous", "(Ljava/util/Collection;)[Z", "", "deadwork", "(Ljava/util/Collection;)[I", "", "", "sakeen", "(Ljava/util/Collection;)[J", "lampshade", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "libyan", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "molet", "", "immediately", "basify", "(Ljava/util/Collection;)Ljava/util/List;", "", "prefect", "(Ljava/lang/Iterable;)Ljava/util/Set;", "R", "transform", "palmyra", "Lkotlin/collections/IndexedValue;", "licking", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "cultivated", C3414a2.d, "coi", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", "", "tectonization", "osteal", "overspeculate", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z", "lightstruck", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "monroe", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "achondroplasia", "claque", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "elements", "julian", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "unconsolidated", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "Lkotlin/Pair;", "fastrack", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "czestochowa", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "underbelly", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Lkotlin/sequences/Sequence;", "clubfoot", "(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;", "", "", "dent", "(Ljava/lang/Iterable;)D", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt___CollectionsKt extends stratoscope {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/CollectionsKt___CollectionsKt$attabal", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal<T> implements Sequence<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Iterable f29297attabal;

        public attabal(Iterable iterable) {
            this.f29297attabal = iterable;
        }

        @Override // p002kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f29297attabal.iterator();
        }
    }

    public static <T> List<T> achondroplasia(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return claque((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        cord.stratoscope(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> List<T> attendance(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return adultoid.formularize();
        }
        int size = list.size();
        if (i >= size) {
            return molet(list);
        }
        if (i == 1) {
            return graveside.marial(igbo(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static <T> List<T> basify(Collection<? extends T> collection2) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        return new ArrayList(collection2);
    }

    public static <T> List<T> claque(Collection<? extends T> collection2, T t) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        ArrayList arrayList = new ArrayList(collection2.size() + 1);
        arrayList.addAll(collection2);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> Sequence<T> clubfoot(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new attabal(iterable);
    }

    public static <T> T coffeecake(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) lerp((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> Set<T> coi(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> setTectonization = tectonization(iterable);
        cord.grimness(setTectonization, other);
        return setTectonization;
    }

    public static <T> List<T> cultivated(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return molet(tectonization(iterable));
    }

    public static final <T, A extends Appendable> A czestochowa(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            impassible.attabal(buffer, t, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static int[] deadwork(Collection<Integer> collection2) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        int[] iArr = new int[collection2.size()];
        Iterator<Integer> it = collection2.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static double dent(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i++;
            if (i < 0) {
                adultoid.adultoid();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static <T> List<T> dhss(List<? extends T> list, IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? adultoid.formularize() : molet(list.subList(indices.wireman().intValue(), indices.marial().intValue() + 1));
    }

    public static <T> int empress(List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(t);
    }

    public static <T, R> List<Pair<T, R>> fastrack(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(dovishness.gintrap(iterable, 10), dovishness.gintrap(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(formularize.attabal(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> T firstOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T gusty(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T hardpan(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) herdbook((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T herdbook(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static boolean[] homozygous(Collection<Boolean> collection2) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        boolean[] zArr = new boolean[collection2.size()];
        Iterator<Boolean> it = collection2.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = it.next().booleanValue();
            i++;
        }
        return zArr;
    }

    public static <T> T igbo(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(adultoid.triweekly(list));
    }

    public static final <T> List<T> immediately(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? basify((Collection) iterable) : (List) lampshade(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C itchy(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : iterable) {
            if (t != null) {
                destination.add(t);
            }
        }
        return destination;
    }

    public static <T> List<T> julian(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return unconsolidated((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        cord.stratoscope(arrayList, iterable);
        cord.stratoscope(arrayList, elements);
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C lampshade(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> T lerp(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> HashSet<T> libyan(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (HashSet) lampshade(iterable, new HashSet(polder.marial(dovishness.gintrap(iterable, 12))));
    }

    public static <T> Iterable<IndexedValue<T>> licking(final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new yemenite(new Function0() { // from class: kotlin.collections.trm
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectionsKt___CollectionsKt.microchemistry(iterable);
            }
        });
    }

    public static <T extends Comparable<? super T>> T lightstruck(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> T lotta(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static <T> List<T> mastfed(Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return adultoid.formularize();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return molet(iterable);
            }
            if (i == 1) {
                return graveside.marial(coffeecake(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return adultoid.molybdenite(arrayList);
    }

    public static final Iterator microchemistry(Iterable iterable) {
        return iterable.iterator();
    }

    public static <T> List<T> milliradian(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (predicate.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> List<T> molet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return adultoid.molybdenite(immediately(iterable));
        }
        Collection collection2 = (Collection) iterable;
        int size = collection2.size();
        if (size == 0) {
            return adultoid.formularize();
        }
        if (size != 1) {
            return basify(collection2);
        }
        return graveside.marial(iterable instanceof List ? ((List) iterable).get(0) : collection2.iterator().next());
    }

    public static <T> List<T> monroe(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterable, 10));
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.wireman(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static <T> T nosophobia(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> Set<T> osteal(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> setTectonization = tectonization(iterable);
        cord.stratoscope(setTectonization, other);
        return setTectonization;
    }

    public static <T> T outmarry(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> boolean overspeculate(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static <T, R> List<R> palmyra(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static <T> boolean permissivist(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return sayid(iterable, t) >= 0;
    }

    public static <T> T picketboat(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T> Set<T> prefect(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return creditor.competently((Set) lampshade(iterable, new LinkedHashSet()));
        }
        Collection collection2 = (Collection) iterable;
        int size = collection2.size();
        if (size == 0) {
            return creditor.marial();
        }
        if (size != 1) {
            return (Set) lampshade(iterable, new LinkedHashSet(polder.marial(collection2.size())));
        }
        return privatdozent.wireman(iterable instanceof List ? ((List) iterable).get(0) : collection2.iterator().next());
    }

    public static <T> List<T> premeiotic(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return molet(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return adultoid.formularize();
            }
            if (size == 1) {
                return graveside.marial(wostteth(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i2 >= i) {
                arrayList.add(t);
            } else {
                i2++;
            }
        }
        return adultoid.molybdenite(arrayList);
    }

    public static /* synthetic */ String preterite(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return underbelly(iterable, charSequence, charSequence2, charSequence3, i, charSequence5, function2);
    }

    public static long[] sakeen(Collection<Long> collection2) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        long[] jArr = new long[collection2.size()];
        Iterator<Long> it = collection2.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static final <T> int sayid(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                adultoid.dovishness();
            }
            if (Intrinsics.wireman(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> setterwort(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listImmediately = immediately(iterable);
            preprohormone.cuirassed(listImmediately, comparator);
            return listImmediately;
        }
        Collection collection2 = (Collection) iterable;
        if (collection2.size() <= 1) {
            return molet(iterable);
        }
        Object[] array = collection2.toArray(new Object[0]);
        arytenoidectomy.stratoscope(array, comparator);
        return arytenoidectomy.wireman(array);
    }

    public static <T> T technofreak(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> Set<T> tectonization(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) lampshade(iterable, new LinkedHashSet());
    }

    public static <T> List<T> timberyard(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            return mastfed(list, wireman.wireman(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> List<T> treadless(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (List) itchy(iterable, new ArrayList());
    }

    public static <T> List<T> unconsolidated(Collection<? extends T> collection2, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection2);
            cord.stratoscope(arrayList, elements);
            return arrayList;
        }
        Collection collection3 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection3.size());
        arrayList2.addAll(collection2);
        arrayList2.addAll(collection3);
        return arrayList2;
    }

    public static final <T> String underbelly(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) czestochowa(iterable, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static <T extends Comparable<? super T>> List<T> vesuvio(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listImmediately = immediately(iterable);
            preprohormone.cord(listImmediately);
            return listImmediately;
        }
        Collection collection2 = (Collection) iterable;
        if (collection2.size() <= 1) {
            return molet(iterable);
        }
        Object[] array = collection2.toArray(new Comparable[0]);
        arytenoidectomy.cuirassed((Comparable[]) array);
        return arytenoidectomy.wireman(array);
    }

    public static <T> T wostteth(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) igbo((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }
}
