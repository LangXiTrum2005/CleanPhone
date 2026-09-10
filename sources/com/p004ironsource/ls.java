package com.p004ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\"\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ironsource/ls;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "", "msg", "a", "Ljava/lang/Runnable;", "runnable", "", "throwable", "", "afterExecute", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "report", "b", "log", "", "threadCount", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ls extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Throwable, Unit> report;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<String, Unit> log;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25649a = new a();

        public a() {
            super(1);
        }

        public final void a(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f43263a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25650a = new b();

        public b() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.f(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f43263a;
        }
    }

    public ls() {
        this(0, null, null, 7, null);
    }

    private final String a(String msg) {
        return ls.class.getName() + " RuntimeException caught: " + msg;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable throwable) {
        Function1<Throwable, Unit> function1;
        Throwable e2;
        super.afterExecute(runnable, throwable);
        if (throwable != null) {
            this.log.invoke(a(throwable.toString()));
            this.report.invoke(throwable);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e3) {
                q9.d().a(e3);
                this.log.invoke(a(e3.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e4) {
                e2 = e4;
                q9.d().a(e2);
                this.log.invoke(a(e2.toString()));
                function1 = this.report;
                function1.invoke(e2);
            } catch (ExecutionException e5) {
                q9.d().a(e5);
                this.log.invoke(a(e5.toString()));
                function1 = this.report;
                e2 = e5.getCause();
                function1.invoke(e2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ls(int i2, Function1<? super Throwable, Unit> report, Function1<? super String, Unit> log) {
        super(i2, new qk());
        Intrinsics.f(report, "report");
        Intrinsics.f(log, "log");
        this.report = report;
        this.log = log;
    }

    public /* synthetic */ ls(int i2, Function1 function1, Function1 function2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? ms.f26196a : i2, (i3 & 2) != 0 ? a.f25649a : function1, (i3 & 4) != 0 ? b.f25650a : function2);
    }
}
