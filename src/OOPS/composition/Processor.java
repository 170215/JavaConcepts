package OOPS.composition;

public class Processor {

    private String brand;
    private String series;
    private int generations;
    private int cores;
    private int thread;
    private String cacheMemory;
    private String frequency;
    private String minFrequency;
    private String maxFrequency;

    public Processor(String brand, String series, int generations, int cores, int thread, String cacheMemory, String frequency, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generations = generations;
        this.cores = cores;
        this.thread = thread;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Processor() {
        this.brand = "intel";
        this.series = "7200u";
        this.generations = 7;
        this.cores = 2;
        this.thread = 4;
        this.cacheMemory = "3MB";
        this.frequency = "2.5GHz";
        this.minFrequency = "2.5GHz";
        this.maxFrequency = "3.1GHz";
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generations=" + generations +
                ", cores=" + cores +
                ", thread=" + thread +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", minFrequency='" + minFrequency + '\'' +
                ", maxFrequency='" + maxFrequency + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGenerations() {
        return generations;
    }

    public int getCores() {
        return cores;
    }

    public int getThread() {
        return thread;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getMinFrequency() {
        return minFrequency;
    }

    public String getMaxFrequency() {
        return maxFrequency;
    }
}
