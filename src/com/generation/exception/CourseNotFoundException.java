package com.generation.exception;

public class CourseNotFoundException extends Exception
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CourseNotFoundException()
    {
        super("course not found!!");
    }
}