/*
 * To change this license headerf, choose License Headers in Project Properties.
 * To change this template filef, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryctabo.random.test;

import java.util.ArrayList;

/**
 * <p>
 * Esta clase <strong>Chi2</strong> es la encargada de ofrecerte todos los 
 * valores de la tabla Chi Cuadrado, la cual puedes buscar de manera rápida un 
 * cierto valor de la tabla.
 * </p>
 * 
 * @author Gustavo Pacheco Gómez
 * @version 1.2
 */
public class Chi2 {

    public ArrayList<Float> alpha = new ArrayList<>();

    private static final float alphav[] = {0.001f, 0.0025f, 0.005f, 0.01f, 0.025f, 0.05f, 0.1f, 0.15f, 0.2f, 0.25f, 0.3f, 0.35f, 0.4f, 0.45f, 0.5f};

    public static final float values[][] = {
        {10.8274f, 9.14040f, 7.87940f, 6.63490f, 5.02390f, 3.84150f, 2.70550f, 2.07220f, 1.64240f, 1.32330f, 1.07420f, 0.87350f, 0.70830f, 0.57070f, 0.45490f},
        {13.8150f, 11.9827f, 10.5965f, 9.21040f, 7.37780f, 5.99150f, 4.60520f, 3.79420f, 3.21890f, 2.77260f, 2.40790f, 2.09960f, 1.83260f, 1.59700f, 1.38630f},
        {16.2660f, 14.3202f, 12.8381f, 11.3449f, 9.34840f, 7.81470f, 6.25140f, 5.31700f, 4.64160f, 4.10830f, 3.66490f, 3.28310f, 2.94620f, 2.64300f, 2.36600f},
        {18.4662f, 16.4238f, 14.8602f, 13.2767f, 11.1433f, 9.48770f, 7.77940f, 6.74490f, 5.98860f, 5.38530f, 4.87840f, 4.43770f, 4.04460f, 3.68710f, 3.35670f},
        {20.5147f, 18.3854f, 16.7496f, 15.0863f, 12.8325f, 11.0705f, 9.23630f, 8.11520f, 7.28930f, 6.62570f, 6.06440f, 5.57310f, 5.13190f, 4.72780f, 4.35150f},
        {22.4575f, 20.2491f, 18.5475f, 16.8119f, 14.4494f, 12.5916f, 10.6446f, 9.44610f, 8.55810f, 7.84080f, 7.23110f, 6.69480f, 6.21080f, 5.76520f, 5.34810f},
        {24.3213f, 22.0402f, 20.2777f, 18.4753f, 16.0128f, 14.0671f, 12.0170f, 10.7479f, 9.80320f, 9.03710f, 8.38340f, 7.80610f, 7.28320f, 6.80000f, 6.34580f},
        {26.1239f, 23.7742f, 21.9549f, 20.0902f, 17.5345f, 15.5073f, 13.3616f, 12.0271f, 11.0301f, 10.2189f, 9.52450f, 8.90940f, 8.35050f, 7.83250f, 7.34410f},
        {27.8767f, 25.4625f, 23.5893f, 21.6660f, 19.0228f, 16.9190f, 14.6837f, 13.2880f, 12.2421f, 11.3887f, 10.6564f, 10.0060f, 9.41360f, 8.86320f, 8.34280f},
        {29.5879f, 27.1119f, 25.1881f, 23.2093f, 20.4832f, 18.3070f, 15.9872f, 14.5339f, 13.4420f, 12.5489f, 11.7807f, 11.0971f, 10.4732f, 9.89220f, 9.34180f},
        {31.2635f, 28.7291f, 26.7569f, 24.7250f, 21.9200f, 19.6752f, 17.2750f, 15.7671f, 14.6314f, 13.7007f, 12.8987f, 12.1836f, 11.5298f, 10.9199f, 10.3410f},
        {32.9092f, 30.3182f, 28.2997f, 26.2170f, 23.3367f, 21.0261f, 18.5493f, 16.9893f, 15.8120f, 14.8454f, 14.0111f, 13.2661f, 12.5838f, 11.9463f, 11.3403f},
        {34.5274f, 31.8830f, 29.8193f, 27.6882f, 24.7356f, 22.3620f, 19.8119f, 18.2020f, 16.9848f, 15.9839f, 15.1187f, 14.3451f, 13.6356f, 12.9717f, 12.3398f},
        {36.1239f, 33.4262f, 31.3194f, 29.1412f, 26.1189f, 23.6848f, 21.0641f, 19.4062f, 18.1508f, 17.1169f, 16.2221f, 15.4209f, 14.6853f, 13.9961f, 13.3393f},
        {37.6978f, 34.9494f, 32.8015f, 30.5780f, 27.4884f, 24.9958f, 22.3071f, 20.6030f, 19.3107f, 18.2451f, 17.3217f, 16.4940f, 15.7332f, 15.0197f, 14.3389f},
        {39.2518f, 36.4555f, 34.2671f, 31.9999f, 28.8453f, 26.2962f, 23.5418f, 21.7931f, 20.4651f, 19.3689f, 18.4179f, 17.5646f, 16.7795f, 16.0425f, 15.3385f},
        {40.7911f, 37.9462f, 35.7184f, 33.4087f, 30.1910f, 27.5871f, 24.7690f, 22.9770f, 21.6146f, 20.4887f, 19.5110f, 18.6330f, 17.8244f, 17.0646f, 16.3382f},
        {42.3119f, 39.4220f, 37.1564f, 34.8052f, 31.5264f, 28.8693f, 25.9894f, 24.1555f, 22.7595f, 21.6049f, 20.6014f, 19.6993f, 18.8679f, 18.0860f, 17.3379f},
        {43.8194f, 40.8847f, 38.5821f, 36.1908f, 32.8523f, 30.1435f, 27.2036f, 25.3289f, 23.9004f, 22.7178f, 21.6891f, 20.7638f, 19.9102f, 19.1069f, 18.3376f},
        {45.3142f, 42.3358f, 39.9969f, 37.5663f, 34.1696f, 31.4104f, 28.4120f, 26.4976f, 25.0375f, 23.8277f, 22.7745f, 21.8265f, 20.9514f, 20.1272f, 19.3374f},
        {46.7963f, 43.7749f, 41.4009f, 38.9322f, 35.4789f, 32.6706f, 29.6151f, 27.6620f, 26.1711f, 24.9348f, 23.8578f, 22.8876f, 21.9915f, 21.1470f, 20.3372f},
        {48.2676f, 45.2041f, 42.7957f, 40.2894f, 36.7807f, 33.9245f, 30.8133f, 28.8224f, 27.3015f, 26.0393f, 24.9390f, 23.9473f, 23.0307f, 22.1663f, 21.3370f},
        {49.7276f, 46.6231f, 44.1814f, 41.6383f, 38.0756f, 35.1725f, 32.0069f, 29.9792f, 28.4288f, 27.1413f, 26.0184f, 25.0055f, 24.0689f, 23.1852f, 22.3369f},
        {51.1790f, 48.0336f, 45.5584f, 42.9798f, 39.3641f, 36.4150f, 33.1962f, 31.1325f, 29.5533f, 28.2412f, 27.0960f, 26.0625f, 25.1064f, 24.2037f, 23.3367f},
        {52.6187f, 49.4351f, 46.9280f, 44.3140f, 40.6465f, 37.6525f, 34.3816f, 32.2825f, 30.6752f, 29.3388f, 28.1719f, 27.1183f, 26.1430f, 25.2218f, 24.3366f},
        {54.0511f, 50.8291f, 48.2898f, 45.6416f, 41.9231f, 38.8851f, 35.5632f, 33.4295f, 31.7946f, 30.4346f, 29.2463f, 28.1730f, 27.1789f, 26.2395f, 25.3365f},
        {55.4751f, 52.2152f, 49.6450f, 46.9628f, 43.1945f, 40.1133f, 36.7412f, 34.5736f, 32.9117f, 31.5284f, 30.3193f, 29.2266f, 28.2141f, 27.2569f, 26.3363f},
        {56.8918f, 53.5939f, 50.9936f, 48.2782f, 44.4608f, 41.3372f, 37.9159f, 35.7150f, 34.0266f, 32.6205f, 31.3909f, 30.2791f, 29.2486f, 28.2740f, 27.3362f},
        {58.3006f, 54.9662f, 52.3355f, 49.5878f, 45.7223f, 42.5569f, 39.0875f, 36.8538f, 35.1394f, 33.7109f, 32.4612f, 31.3308f, 30.2825f, 29.2908f, 28.3361f}
    };
    
    private static Chi2 singleton;
    
    private Chi2() {
        this.alpha = new ArrayList<>();
        
        for (float item : alphav) {
            alpha.add(item);
        }
    }
    
    public static Chi2 getInstance() {
        if (singleton == null)
            singleton = new Chi2();
        
        return singleton;
    }
    
    public float getValue(float alpha, int degreeOfFreedom) {
        int alphaColumn = this.alpha.lastIndexOf(alpha);
        return Chi2.values[--degreeOfFreedom][alphaColumn];
    }
}