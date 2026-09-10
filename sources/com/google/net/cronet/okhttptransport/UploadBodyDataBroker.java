package com.google.net.cronet.okhttptransport;

import android.util.Pair;
import com.google.common.base.formularize;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.stratoscope;
import duvetyn.restrictive;
import duvetyn.sealless;
import duvetyn.wireman;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadBodyDataBroker implements sealless {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final BlockingQueue f23115kowloon = new ArrayBlockingQueue(1);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final AtomicBoolean f23114arytenoidectomy = new AtomicBoolean();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final AtomicReference f23116monoploid = new AtomicReference();

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public enum ReadResult {
        SUCCESS,
        END_OF_BODY
    }

    public Future attabal(ByteBuffer byteBuffer) {
        Throwable th = (Throwable) this.f23116monoploid.get();
        if (th != null) {
            return arytenoidectomy.competently(th);
        }
        stratoscope stratoscopeVarKattegat = stratoscope.kattegat();
        this.f23115kowloon.add(Pair.create(byteBuffer, stratoscopeVarKattegat));
        Throwable th2 = (Throwable) this.f23116monoploid.get();
        if (th2 != null) {
            stratoscopeVarKattegat.oilcan(th2);
        }
        return stratoscopeVarKattegat;
    }

    @Override // duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23114arytenoidectomy.set(true);
    }

    public void dern() throws IOException {
        if (this.f23114arytenoidectomy.getAndSet(true)) {
            throw new IllegalStateException("Already closed");
        }
        ((stratoscope) saneness().second).trm(ReadResult.END_OF_BODY);
    }

    public void marial(Throwable th) {
        this.f23116monoploid.set(th);
        Pair pair = (Pair) this.f23115kowloon.poll();
        if (pair != null) {
            ((stratoscope) pair.second).oilcan(th);
        }
    }

    public final Pair saneness() throws IOException {
        try {
            return (Pair) this.f23115kowloon.take();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting for a read to finish!");
        }
    }

    @Override // duvetyn.sealless
    public void supplicat(wireman wiremanVar, long j) throws IOException {
        formularize.graveside(!this.f23114arytenoidectomy.get());
        while (j != 0) {
            Pair pairSaneness = saneness();
            ByteBuffer byteBuffer = (ByteBuffer) pairSaneness.first;
            stratoscope stratoscopeVar = (stratoscope) pairSaneness.second;
            int iLimit = byteBuffer.limit();
            byteBuffer.limit((int) Math.min(iLimit, j));
            try {
                long j2 = wiremanVar.read(byteBuffer);
                if (j2 == -1) {
                    IOException iOException = new IOException("The source has been exhausted but we expected more!");
                    stratoscopeVar.oilcan(iOException);
                    throw iOException;
                }
                j -= j2;
                byteBuffer.limit(iLimit);
                stratoscopeVar.trm(ReadResult.SUCCESS);
            } catch (IOException e) {
                stratoscopeVar.oilcan(e);
                throw e;
            }
        }
    }

    @Override // duvetyn.sealless
    /* JADX INFO: renamed from: timeout */
    public restrictive getF25464kowloon() {
        return restrictive.f25446marial;
    }

    @Override // duvetyn.sealless, java.io.Flushable
    public void flush() {
    }
}
