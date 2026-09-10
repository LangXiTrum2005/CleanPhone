package com.badlogic.gdx.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.Timer;

/* JADX INFO: loaded from: classes.dex */
public class GestureDetector extends InputAdapter {
    private boolean inTapRectangle;
    private final Vector2 initialPointer1;
    private final Vector2 initialPointer2;
    private int lastTapButton;
    private int lastTapPointer;
    private long lastTapTime;
    private float lastTapX;
    private float lastTapY;
    final GestureListener listener;
    boolean longPressFired;
    private float longPressSeconds;
    private final Timer.Task longPressTask;
    private long maxFlingDelay;
    private boolean panning;
    private boolean pinching;
    Vector2 pointer1;
    private final Vector2 pointer2;
    private int tapCount;
    private long tapCountInterval;
    private float tapRectangleCenterX;
    private float tapRectangleCenterY;
    private float tapRectangleHeight;
    private float tapRectangleWidth;
    private long touchDownTime;
    private final VelocityTracker tracker;

    public static class GestureAdapter implements GestureListener {
        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean fling(float f, float f2, int i) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean longPress(float f, float f2) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean pan(float f, float f2, float f3, float f4) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean panStop(float f, float f2, int i, int i2) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean pinch(Vector2 vector2, Vector2 vector3, Vector2 vector4, Vector2 vector5) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public void pinchStop() {
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean tap(float f, float f2, int i, int i2) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean touchDown(float f, float f2, int i, int i2) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean zoom(float f, float f2) {
            return false;
        }
    }

    public interface GestureListener {
        boolean fling(float f, float f2, int i);

        boolean longPress(float f, float f2);

        boolean pan(float f, float f2, float f3, float f4);

        boolean panStop(float f, float f2, int i, int i2);

        boolean pinch(Vector2 vector2, Vector2 vector3, Vector2 vector4, Vector2 vector5);

        void pinchStop();

        boolean tap(float f, float f2, int i, int i2);

        boolean touchDown(float f, float f2, int i, int i2);

        boolean zoom(float f, float f2);
    }

    public GestureDetector(GestureListener gestureListener) {
        this(20.0f, 0.4f, 1.1f, 2.1474836E9f, gestureListener);
    }

    private boolean isWithinTapRectangle(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3) < this.tapRectangleWidth && Math.abs(f2 - f4) < this.tapRectangleHeight;
    }

    public void cancel() {
        this.longPressTask.cancel();
        this.longPressFired = true;
    }

    public void invalidateTapSquare() {
        this.inTapRectangle = false;
    }

    public boolean isLongPressed() {
        return isLongPressed(this.longPressSeconds);
    }

    public boolean isPanning() {
        return this.panning;
    }

    public void reset() {
        this.longPressTask.cancel();
        this.touchDownTime = 0L;
        this.panning = false;
        this.inTapRectangle = false;
        this.tracker.lastTime = 0L;
    }

    public void setLongPressSeconds(float f) {
        this.longPressSeconds = f;
    }

    public void setMaxFlingDelay(long j) {
        this.maxFlingDelay = j;
    }

    public void setTapCountInterval(float f) {
        this.tapCountInterval = (long) (f * 1.0E9f);
    }

    public void setTapRectangleSize(float f, float f2) {
        this.tapRectangleWidth = f;
        this.tapRectangleHeight = f2;
    }

    public void setTapSquareSize(float f) {
        setTapRectangleSize(f, f);
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchCancelled(int i, int i2, int i3, int i4) {
        cancel();
        return super.touchCancelled(i, i2, i3, i4);
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchDown(int i, int i2, int i3, int i4) {
        return touchDown(i, i2, i3, i4);
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchDragged(int i, int i2, int i3) {
        return touchDragged(i, i2, i3);
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchUp(int i, int i2, int i3, int i4) {
        return touchUp(i, i2, i3, i4);
    }

    public static class VelocityTracker {
        float deltaX;
        float deltaY;
        long lastTime;
        float lastX;
        float lastY;
        int numSamples;
        int sampleSize = 10;
        float[] meanX = new float[10];
        float[] meanY = new float[10];
        long[] meanTime = new long[10];

        private float getAverage(float[] fArr, int i) {
            int iMin = Math.min(this.sampleSize, i);
            float f = 0.0f;
            for (int i2 = 0; i2 < iMin; i2++) {
                f += fArr[i2];
            }
            return f / iMin;
        }

        private float getSum(float[] fArr, int i) {
            int iMin = Math.min(this.sampleSize, i);
            float f = 0.0f;
            for (int i2 = 0; i2 < iMin; i2++) {
                f += fArr[i2];
            }
            if (iMin == 0) {
                return 0.0f;
            }
            return f;
        }

        public float getVelocityX() {
            float average = getAverage(this.meanX, this.numSamples);
            float average2 = getAverage(this.meanTime, this.numSamples) / 1.0E9f;
            if (average2 == 0.0f) {
                return 0.0f;
            }
            return average / average2;
        }

        public float getVelocityY() {
            float average = getAverage(this.meanY, this.numSamples);
            float average2 = getAverage(this.meanTime, this.numSamples) / 1.0E9f;
            if (average2 == 0.0f) {
                return 0.0f;
            }
            return average / average2;
        }

        public void start(float f, float f2, long j) {
            this.lastX = f;
            this.lastY = f2;
            this.deltaX = 0.0f;
            this.deltaY = 0.0f;
            this.numSamples = 0;
            for (int i = 0; i < this.sampleSize; i++) {
                this.meanX[i] = 0.0f;
                this.meanY[i] = 0.0f;
                this.meanTime[i] = 0;
            }
            this.lastTime = j;
        }

        public void update(float f, float f2, long j) {
            float f3 = f - this.lastX;
            this.deltaX = f3;
            float f4 = f2 - this.lastY;
            this.deltaY = f4;
            this.lastX = f;
            this.lastY = f2;
            long j2 = j - this.lastTime;
            this.lastTime = j;
            int i = this.numSamples;
            int i2 = i % this.sampleSize;
            this.meanX[i2] = f3;
            this.meanY[i2] = f4;
            this.meanTime[i2] = j2;
            this.numSamples = i + 1;
        }

        private long getAverage(long[] jArr, int i) {
            int iMin = Math.min(this.sampleSize, i);
            long j = 0;
            for (int i2 = 0; i2 < iMin; i2++) {
                j += jArr[i2];
            }
            if (iMin == 0) {
                return 0L;
            }
            return j / ((long) iMin);
        }
    }

    public GestureDetector(float f, float f2, float f3, float f4, GestureListener gestureListener) {
        this(f, f, f2, f3, f4, gestureListener);
    }

    public boolean isLongPressed(float f) {
        return this.touchDownTime != 0 && TimeUtils.nanoTime() - this.touchDownTime > ((long) (f * 1.0E9f));
    }

    public boolean touchDown(float f, float f2, int i, int i2) {
        if (i > 1) {
            return false;
        }
        if (i == 0) {
            this.pointer1.set(f, f2);
            long currentEventTime = Gdx.input.getCurrentEventTime();
            this.touchDownTime = currentEventTime;
            this.tracker.start(f, f2, currentEventTime);
            if (Gdx.input.isTouched(1)) {
                this.inTapRectangle = false;
                this.pinching = true;
                this.initialPointer1.set(this.pointer1);
                this.initialPointer2.set(this.pointer2);
                this.longPressTask.cancel();
            } else {
                this.inTapRectangle = true;
                this.pinching = false;
                this.longPressFired = false;
                this.tapRectangleCenterX = f;
                this.tapRectangleCenterY = f2;
                if (!this.longPressTask.isScheduled()) {
                    Timer.schedule(this.longPressTask, this.longPressSeconds);
                }
            }
        } else {
            this.pointer2.set(f, f2);
            this.inTapRectangle = false;
            this.pinching = true;
            this.initialPointer1.set(this.pointer1);
            this.initialPointer2.set(this.pointer2);
            this.longPressTask.cancel();
        }
        return this.listener.touchDown(f, f2, i, i2);
    }

    public boolean touchDragged(float f, float f2, int i) {
        if (i > 1 || this.longPressFired) {
            return false;
        }
        if (i == 0) {
            this.pointer1.set(f, f2);
        } else {
            this.pointer2.set(f, f2);
        }
        if (this.pinching) {
            return this.listener.zoom(this.initialPointer1.dst(this.initialPointer2), this.pointer1.dst(this.pointer2)) || this.listener.pinch(this.initialPointer1, this.initialPointer2, this.pointer1, this.pointer2);
        }
        this.tracker.update(f, f2, Gdx.input.getCurrentEventTime());
        if (this.inTapRectangle && !isWithinTapRectangle(f, f2, this.tapRectangleCenterX, this.tapRectangleCenterY)) {
            this.longPressTask.cancel();
            this.inTapRectangle = false;
        }
        if (this.inTapRectangle) {
            return false;
        }
        this.panning = true;
        GestureListener gestureListener = this.listener;
        VelocityTracker velocityTracker = this.tracker;
        return gestureListener.pan(f, f2, velocityTracker.deltaX, velocityTracker.deltaY);
    }

    public boolean touchUp(float f, float f2, int i, int i2) {
        if (i > 1) {
            return false;
        }
        if (this.inTapRectangle && !isWithinTapRectangle(f, f2, this.tapRectangleCenterX, this.tapRectangleCenterY)) {
            this.inTapRectangle = false;
        }
        boolean z = this.panning;
        this.panning = false;
        this.longPressTask.cancel();
        if (this.longPressFired) {
            return false;
        }
        if (this.inTapRectangle) {
            if (this.lastTapButton != i2 || this.lastTapPointer != i || TimeUtils.nanoTime() - this.lastTapTime > this.tapCountInterval || !isWithinTapRectangle(f, f2, this.lastTapX, this.lastTapY)) {
                this.tapCount = 0;
            }
            this.tapCount++;
            this.lastTapTime = TimeUtils.nanoTime();
            this.lastTapX = f;
            this.lastTapY = f2;
            this.lastTapButton = i2;
            this.lastTapPointer = i;
            this.touchDownTime = 0L;
            return this.listener.tap(f, f2, this.tapCount, i2);
        }
        if (!this.pinching) {
            boolean zPanStop = (!z || this.panning) ? false : this.listener.panStop(f, f2, i, i2);
            long currentEventTime = Gdx.input.getCurrentEventTime();
            if (currentEventTime - this.touchDownTime <= this.maxFlingDelay) {
                this.tracker.update(f, f2, currentEventTime);
                zPanStop = this.listener.fling(this.tracker.getVelocityX(), this.tracker.getVelocityY(), i2) || zPanStop;
            }
            this.touchDownTime = 0L;
            return zPanStop;
        }
        this.pinching = false;
        this.listener.pinchStop();
        this.panning = true;
        if (i == 0) {
            VelocityTracker velocityTracker = this.tracker;
            Vector2 vector2 = this.pointer2;
            velocityTracker.start(vector2.x, vector2.y, Gdx.input.getCurrentEventTime());
        } else {
            VelocityTracker velocityTracker2 = this.tracker;
            Vector2 vector3 = this.pointer1;
            velocityTracker2.start(vector3.x, vector3.y, Gdx.input.getCurrentEventTime());
        }
        return false;
    }

    public GestureDetector(float f, float f2, float f3, float f4, float f5, GestureListener gestureListener) {
        this.tracker = new VelocityTracker();
        this.pointer1 = new Vector2();
        this.pointer2 = new Vector2();
        this.initialPointer1 = new Vector2();
        this.initialPointer2 = new Vector2();
        this.longPressTask = new Timer.Task() { // from class: com.badlogic.gdx.input.GestureDetector.1
            @Override // com.badlogic.gdx.utils.Timer.Task, java.lang.Runnable
            public void run() {
                GestureDetector gestureDetector = GestureDetector.this;
                if (gestureDetector.longPressFired) {
                    return;
                }
                GestureListener gestureListener2 = gestureDetector.listener;
                Vector2 vector2 = gestureDetector.pointer1;
                gestureDetector.longPressFired = gestureListener2.longPress(vector2.x, vector2.y);
            }
        };
        if (gestureListener != null) {
            this.tapRectangleWidth = f;
            this.tapRectangleHeight = f2;
            this.tapCountInterval = (long) (f3 * 1.0E9f);
            this.longPressSeconds = f4;
            this.maxFlingDelay = (long) (f5 * 1.0E9f);
            this.listener = gestureListener;
            return;
        }
        throw new IllegalArgumentException("listener cannot be null.");
    }
}
