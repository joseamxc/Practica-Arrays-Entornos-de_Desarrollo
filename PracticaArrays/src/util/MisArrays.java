package util;

import java.util.Arrays;

public abstract class MisArrays {
	public class MaximaNota {
	    public static int maximaNota(int[] notas) {
	        if (notas == null) {
	            throw new IllegalArgumentException("El array no puede ser nulo");
	        }
	        if (notas.length == 0) {
	            throw new IllegalArgumentException("El array no puede estar vacio");
	        }
	        
	        int max = notas[0];
	        for (int nota : notas) {
	            if (nota < 0 || nota > 10) {
	                throw new IllegalArgumentException("Los numeros deben estar entre el 1 y el 10");
	            }
	            if (nota > max) {
	                max = nota;
	            }
	        }
	        
	        return max;
	    }
	}
	
	
	public class MinimaNota {
	    public static int minimaNota(int[] notas) {
	        if (notas == null) {
	            throw new IllegalArgumentException("El array no puede ser nulo");
	        }
	        if (notas.length == 0) {
	            throw new IllegalArgumentException("El array no puede estar vacio");
	        }

	        int min = notas[0];
	        for (int nota : notas) {
	            if (nota < 0 || nota > 10) {
	                throw new IllegalArgumentException("Los numeros deben estar entre el 1 y el 10");
	            }
	            if (nota < min) {
	                min = nota;
	            }
	        }

	        return min;
	    }
	}
	
	
	
	public class MedianaNotas {
	    public static float medianaNotas(int[] notas) {
	        if (notas == null) {
	            throw new IllegalArgumentException("El array no puede ser nulo");
	        }
	        if (notas.length == 0) {
	            throw new IllegalArgumentException("El array no puede estar vacio");
	        }

	        Arrays.sort(notas);

	        if (notas.length % 2 == 0) {
	            // Even number of elements, so the median is the average of the two middle elements
	            int middleIndex1 = notas.length / 2 - 1;
	            int middleIndex2 = notas.length / 2;
	            return (notas[middleIndex1] + notas[middleIndex2]) / 2.0f;
	        } else {
	            // Odd number of elements, so the median is the middle element
	            int middleIndex = notas.length / 2;
	            return notas[middleIndex];
	        }
	    }
	
	
	
	public class MediaNotas {
	    public static float mediaNotas(int[] notas) {
	        if (notas == null) {
	            throw new IllegalArgumentException("El array no puede ser nulo");
	        }
	        if (notas.length == 0) {
	            throw new IllegalArgumentException("El array no puede estar vacio");
	        }

	        int sum = 0;
	        for (int nota : notas) {
	            if (nota < 0 || nota > 10) {
	                throw new IllegalArgumentException("Los numeros deben estar entre el 1 y el 10");
	            }
	            sum += nota;
	        }

	        return (float) sum / notas.length;
	    }
	}
	}
}