# WG Blendz Barbershop Booking System

## Overview

WG Blendz is a comprehensive barbershop booking system designed to provide users with an easy and efficient way to book appointments online. This application is built with React for the frontend and Java with Spring Boot for the backend. It features a seamless user interface, robust booking capabilities, and secure data handling.

## Table of Contents

- [Features](#features)
- [System Requirements](#system-requirements)
- [Installation](#installation)

## Features

### Frontend

- **Home Page**: Overview of the barbershop, with call-to-action buttons and navigation links.
- **Services Page**: Lists available services with detailed descriptions, prices, and "Book Now" buttons.
- **Gallery Page**: Showcases images of hairstyles and services provided by the barbershop.
- **Testimonials Page**: Displays customer reviews and 5-star ratings.
- **Booking System**: Allows users to book appointments by selecting a service, date, time, and preferred staff member, with email confirmation.
- **Navigation Bar**: User-friendly and centered navigation bar for easy access to different pages.
- **Footer**: Contains contact details, business hours, and social media links.

### Backend

- **API for Bookings**: Manages booking data, preventing duplicate bookings and sending confirmation emails.
- **Email Service**: Sends confirmation emails to users upon successful booking.
- **Local Storage Database**: Stores user accounts, booking information, services, and testimonials for development and testing.

## System Requirements

- **Node.js**: v14.x or higher
- **Java**: JDK 11 or higher
- **Maven**: 3.6.3 or higher
- **Spring Boot**: 2.5.4 or higher

## Installation and Running the Application


1. Clone the repository:  git clone https://github.com/your-username/wg-blendz.git
   cd wg-blendz
2. For the backend navigate to the backend directory run mvn spring-boot:run in the terminal
3. For the frontend navigate to the frontend directory and run the command npm start in order to start frontend
