package com.badlogic.gdx;

import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.NumberUtils;

/* JADX INFO: loaded from: classes.dex */
public class InputEventQueue {
    private static final int KEY_DOWN = 0;
    private static final int KEY_TYPED = 2;
    private static final int KEY_UP = 1;
    private static final int MOUSE_MOVED = 6;
    private static final int SCROLLED = 7;
    private static final int SKIP = -1;
    private static final int TOUCH_DOWN = 3;
    private static final int TOUCH_DRAGGED = 5;
    private static final int TOUCH_UP = 4;
    private long currentEventTime;
    private final IntArray queue = new IntArray();
    private final IntArray processingQueue = new IntArray();

    private synchronized int next(int i, int i2) {
        try {
            IntArray intArray = this.queue;
            int[] iArr = intArray.items;
            int i3 = intArray.size;
            while (i2 < i3) {
                int i4 = iArr[i2];
                if (i4 == i) {
                    return i2;
                }
                int i5 = i2 + 3;
                switch (i4) {
                    case -1:
                        i2 = i5 + iArr[i5];
                        continue;
                    case 0:
                    case 1:
                    case 2:
                        i2 += 4;
                        continue;
                    case 3:
                    case 4:
                        i2 += 7;
                        continue;
                    case 5:
                        i2 += 6;
                        continue;
                    case 6:
                    case 7:
                        i2 += 5;
                        continue;
                    default:
                        throw new RuntimeException();
                }
                throw th;
            }
            return -1;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void queueTime(long j) {
        this.queue.add((int) (j >> 32));
        this.queue.add((int) j);
    }

    public void drain(@Null InputProcessor inputProcessor) {
        synchronized (this) {
            try {
                if (inputProcessor == null) {
                    this.queue.clear();
                    return;
                }
                this.processingQueue.addAll(this.queue);
                this.queue.clear();
                IntArray intArray = this.processingQueue;
                int[] iArr = intArray.items;
                int i = intArray.size;
                int i2 = 0;
                while (i2 < i) {
                    int i3 = iArr[i2];
                    int i4 = i2 + 3;
                    this.currentEventTime = (((long) iArr[i2 + 1]) << 32) | (((long) iArr[i2 + 2]) & 4294967295L);
                    switch (i3) {
                        case -1:
                            i2 = i4 + iArr[i4];
                            break;
                        case 0:
                            i2 += 4;
                            inputProcessor.keyDown(iArr[i4]);
                            break;
                        case 1:
                            i2 += 4;
                            inputProcessor.keyUp(iArr[i4]);
                            break;
                        case 2:
                            i2 += 4;
                            inputProcessor.keyTyped((char) iArr[i4]);
                            break;
                        case 3:
                            int i5 = iArr[i4];
                            int i6 = iArr[i2 + 4];
                            int i7 = i2 + 6;
                            int i8 = iArr[i2 + 5];
                            i2 += 7;
                            inputProcessor.touchDown(i5, i6, i8, iArr[i7]);
                            break;
                        case 4:
                            int i9 = iArr[i4];
                            int i10 = iArr[i2 + 4];
                            int i11 = i2 + 6;
                            int i12 = iArr[i2 + 5];
                            i2 += 7;
                            inputProcessor.touchUp(i9, i10, i12, iArr[i11]);
                            break;
                        case 5:
                            int i13 = iArr[i4];
                            int i14 = i2 + 5;
                            int i15 = iArr[i2 + 4];
                            i2 += 6;
                            inputProcessor.touchDragged(i13, i15, iArr[i14]);
                            break;
                        case 6:
                            int i16 = i2 + 4;
                            i2 += 5;
                            inputProcessor.mouseMoved(iArr[i4], iArr[i16]);
                            break;
                        case 7:
                            int i17 = i2 + 4;
                            i2 += 5;
                            inputProcessor.scrolled(NumberUtils.intBitsToFloat(iArr[i4]), NumberUtils.intBitsToFloat(iArr[i17]));
                            break;
                        default:
                            throw new RuntimeException();
                    }
                }
                this.processingQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long getCurrentEventTime() {
        return this.currentEventTime;
    }

    public synchronized boolean keyDown(int i, long j) {
        this.queue.add(0);
        queueTime(j);
        this.queue.add(i);
        return false;
    }

    public synchronized boolean keyTyped(char c, long j) {
        this.queue.add(2);
        queueTime(j);
        this.queue.add(c);
        return false;
    }

    public synchronized boolean keyUp(int i, long j) {
        this.queue.add(1);
        queueTime(j);
        this.queue.add(i);
        return false;
    }

    public synchronized boolean mouseMoved(int i, int i2, long j) {
        try {
            int next = next(6, 0);
            while (next >= 0) {
                this.queue.set(next, -1);
                this.queue.set(next + 3, 2);
                next = next(6, next + 5);
            }
            this.queue.add(6);
            queueTime(j);
            this.queue.add(i);
            this.queue.add(i2);
        } catch (Throwable th) {
            throw th;
        }
        return false;
    }

    public synchronized boolean scrolled(float f, float f2, long j) {
        this.queue.add(7);
        queueTime(j);
        this.queue.add(NumberUtils.floatToIntBits(f));
        this.queue.add(NumberUtils.floatToIntBits(f2));
        return false;
    }

    public synchronized boolean touchDown(int i, int i2, int i3, int i4, long j) {
        this.queue.add(3);
        queueTime(j);
        this.queue.add(i);
        this.queue.add(i2);
        this.queue.add(i3);
        this.queue.add(i4);
        return false;
    }

    public synchronized boolean touchDragged(int i, int i2, int i3, long j) {
        try {
            int next = next(5, 0);
            while (next >= 0) {
                if (this.queue.get(next + 5) == i3) {
                    this.queue.set(next, -1);
                    this.queue.set(next + 3, 3);
                }
                next = next(5, next + 6);
            }
            this.queue.add(5);
            queueTime(j);
            this.queue.add(i);
            this.queue.add(i2);
            this.queue.add(i3);
        } catch (Throwable th) {
            throw th;
        }
        return false;
    }

    public synchronized boolean touchUp(int i, int i2, int i3, int i4, long j) {
        this.queue.add(4);
        queueTime(j);
        this.queue.add(i);
        this.queue.add(i2);
        this.queue.add(i3);
        this.queue.add(i4);
        return false;
    }
}
