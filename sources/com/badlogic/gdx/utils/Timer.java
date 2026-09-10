package com.badlogic.gdx.utils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.LifecycleListener;

/* JADX INFO: loaded from: classes.dex */
public class Timer {
    static TimerThread thread;
    static final Object threadLock = new Object();
    long stopTimeMillis;
    final Array<Task> tasks = new Array<>(false, 8);

    public static abstract class Task implements Runnable {
        final Application app;
        long executeTimeMillis;
        long intervalMillis;
        int repeatCount;
        volatile Timer timer;

        public Task() {
            Application application = Gdx.app;
            this.app = application;
            if (application == null) {
                throw new IllegalStateException("Gdx.app not available.");
            }
        }

        public void cancel() {
            synchronized (Timer.threadLock) {
                try {
                    Timer.thread().removePostedTask(this);
                    Timer timer = this.timer;
                    if (timer != null) {
                        synchronized (timer) {
                            timer.tasks.removeValue(this, true);
                            reset();
                        }
                    } else {
                        reset();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public synchronized long getExecuteTimeMillis() {
            return this.executeTimeMillis;
        }

        public boolean isScheduled() {
            return this.timer != null;
        }

        public synchronized void reset() {
            this.executeTimeMillis = 0L;
            this.timer = null;
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public static class TimerThread implements Runnable, LifecycleListener {
        final Application app;
        Timer instance;
        long pauseTimeMillis;
        final Array<Timer> instances = new Array<>(1);
        final Array<Task> postedTasks = new Array<>(2);
        final Array<Task> runTasks = new Array<>(2);
        private final Runnable runPostedTasks = new Runnable() { // from class: com.badlogic.gdx.utils.Timer.TimerThread.1
            @Override // java.lang.Runnable
            public void run() {
                TimerThread.this.runPostedTasks();
            }
        };
        final Files files = Gdx.files;

        public TimerThread() {
            Application application = Gdx.app;
            this.app = application;
            application.addLifecycleListener(this);
            resume();
            Thread thread = new Thread(this, "Timer");
            thread.setDaemon(true);
            thread.start();
        }

        public void addPostedTask(Task task) {
            synchronized (this.postedTasks) {
                try {
                    if (this.postedTasks.isEmpty()) {
                        task.app.postRunnable(this.runPostedTasks);
                    }
                    this.postedTasks.add(task);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.badlogic.gdx.LifecycleListener
        public void dispose() {
            Object obj = Timer.threadLock;
            synchronized (obj) {
                try {
                    synchronized (this.postedTasks) {
                        this.postedTasks.clear();
                    }
                    if (Timer.thread == this) {
                        Timer.thread = null;
                    }
                    this.instances.clear();
                    obj.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.app.removeLifecycleListener(this);
        }

        @Override // com.badlogic.gdx.LifecycleListener
        public void pause() {
            Object obj = Timer.threadLock;
            synchronized (obj) {
                this.pauseTimeMillis = System.nanoTime() / 1000000;
                obj.notifyAll();
            }
        }

        public void removePostedTask(Task task) {
            synchronized (this.postedTasks) {
                try {
                    Array<Task> array = this.postedTasks;
                    Task[] taskArr = array.items;
                    for (int i = array.size - 1; i >= 0; i--) {
                        if (taskArr[i] == task) {
                            this.postedTasks.removeIndex(i);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.badlogic.gdx.LifecycleListener
        public void resume() {
            synchronized (Timer.threadLock) {
                try {
                    long jNanoTime = (System.nanoTime() / 1000000) - this.pauseTimeMillis;
                    int i = this.instances.size;
                    for (int i2 = 0; i2 < i; i2++) {
                        this.instances.get(i2).delay(jNanoTime);
                    }
                    this.pauseTimeMillis = 0L;
                    Timer.threadLock.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (Timer.threadLock) {
                    try {
                        if (Timer.thread != this || this.files != Gdx.files) {
                            break;
                        }
                        long j = 5000;
                        if (this.pauseTimeMillis == 0) {
                            long jNanoTime = System.nanoTime() / 1000000;
                            int i = this.instances.size;
                            long jUpdate = 5000;
                            for (int i2 = 0; i2 < i; i2++) {
                                try {
                                    jUpdate = this.instances.get(i2).update(this, jNanoTime, jUpdate);
                                } catch (Throwable th) {
                                    throw new GdxRuntimeException("Task failed: " + this.instances.get(i2).getClass().getName(), th);
                                }
                            }
                            j = jUpdate;
                        }
                        if (Timer.thread == this && this.files == Gdx.files) {
                            if (j > 0) {
                                try {
                                    Timer.threadLock.wait(j);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        dispose();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            dispose();
        }

        public void runPostedTasks() {
            synchronized (this.postedTasks) {
                this.runTasks.addAll(this.postedTasks);
                this.postedTasks.clear();
            }
            Array<Task> array = this.runTasks;
            Task[] taskArr = array.items;
            int i = array.size;
            for (int i2 = 0; i2 < i; i2++) {
                taskArr[i2].run();
            }
            this.runTasks.clear();
        }
    }

    public Timer() {
        start();
    }

    public static Timer instance() {
        Timer timer;
        synchronized (threadLock) {
            try {
                TimerThread timerThreadThread = thread();
                if (timerThreadThread.instance == null) {
                    timerThreadThread.instance = new Timer();
                }
                timer = timerThreadThread.instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return timer;
    }

    public static Task post(Task task) {
        return instance().postTask(task);
    }

    public static Task schedule(Task task, float f) {
        return instance().scheduleTask(task, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TimerThread thread() {
        TimerThread timerThread;
        synchronized (threadLock) {
            try {
                TimerThread timerThread2 = thread;
                if (timerThread2 == null || timerThread2.files != Gdx.files) {
                    if (timerThread2 != null) {
                        timerThread2.dispose();
                    }
                    thread = new TimerThread();
                }
                timerThread = thread;
            } catch (Throwable th) {
                throw th;
            }
        }
        return timerThread;
    }

    public void clear() {
        synchronized (threadLock) {
            TimerThread timerThreadThread = thread();
            synchronized (this) {
                synchronized (timerThreadThread.postedTasks) {
                    try {
                        int i = this.tasks.size;
                        for (int i2 = 0; i2 < i; i2++) {
                            Task task = this.tasks.get(i2);
                            timerThreadThread.removePostedTask(task);
                            task.reset();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.tasks.clear();
            }
        }
    }

    public synchronized void delay(long j) {
        int i = this.tasks.size;
        for (int i2 = 0; i2 < i; i2++) {
            Task task = this.tasks.get(i2);
            synchronized (task) {
                task.executeTimeMillis += j;
            }
        }
    }

    public synchronized boolean isEmpty() {
        return this.tasks.size == 0;
    }

    public Task postTask(Task task) {
        return scheduleTask(task, 0.0f, 0.0f, 0);
    }

    public Task scheduleTask(Task task, float f) {
        return scheduleTask(task, f, 0.0f, 0);
    }

    public void start() {
        Object obj = threadLock;
        synchronized (obj) {
            try {
                Array<Timer> array = thread().instances;
                if (array.contains(this, true)) {
                    return;
                }
                array.add(this);
                if (this.stopTimeMillis > 0) {
                    delay((System.nanoTime() / 1000000) - this.stopTimeMillis);
                    this.stopTimeMillis = 0L;
                }
                obj.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void stop() {
        synchronized (threadLock) {
            try {
                if (thread().instances.removeValue(this, true)) {
                    this.stopTimeMillis = System.nanoTime() / 1000000;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized long update(TimerThread timerThread, long j, long j2) {
        int i = this.tasks.size;
        int i2 = 0;
        while (i2 < i) {
            Task task = this.tasks.get(i2);
            synchronized (task) {
                try {
                    long j3 = task.executeTimeMillis;
                    if (j3 > j) {
                        j2 = Math.min(j2, j3 - j);
                    } else {
                        if (task.repeatCount == 0) {
                            task.timer = null;
                            this.tasks.removeIndex(i2);
                            i2--;
                            i--;
                        } else {
                            long j4 = task.intervalMillis;
                            task.executeTimeMillis = j + j4;
                            j2 = Math.min(j2, j4);
                            int i3 = task.repeatCount;
                            if (i3 > 0) {
                                task.repeatCount = i3 - 1;
                            }
                        }
                        timerThread.addPostedTask(task);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2++;
        }
        return j2;
    }

    public static Task schedule(Task task, float f, float f2) {
        return instance().scheduleTask(task, f, f2);
    }

    public Task scheduleTask(Task task, float f, float f2) {
        return scheduleTask(task, f, f2, -1);
    }

    public static Task schedule(Task task, float f, float f2, int i) {
        return instance().scheduleTask(task, f, f2, i);
    }

    public Task scheduleTask(Task task, float f, float f2, int i) {
        Object obj = threadLock;
        synchronized (obj) {
            synchronized (this) {
                synchronized (task) {
                    if (task.timer == null) {
                        task.timer = this;
                        long jNanoTime = System.nanoTime() / 1000000;
                        long j = ((long) (f * 1000.0f)) + jNanoTime;
                        long j2 = thread.pauseTimeMillis;
                        if (j2 > 0) {
                            j -= jNanoTime - j2;
                        }
                        task.executeTimeMillis = j;
                        task.intervalMillis = (long) (f2 * 1000.0f);
                        task.repeatCount = i;
                        this.tasks.add(task);
                    } else {
                        throw new IllegalArgumentException("The same task may not be scheduled twice.");
                    }
                }
            }
            obj.notifyAll();
        }
        return task;
    }
}
