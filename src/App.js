import React from 'react';
import { Routes, Route } from 'react-router-dom';
import 'materialize-css/dist/css/materialize.min.css';
import './App.css';
import { Home } from './components/Home';
import AdminLogin from './components/AdminLogin';
import UserLogin from './components/UserLogin';
import Admin from './components/Admin';
import User from './components/User';
import { UserRegistration } from './components/UserRegistration';
import Office from './components/Office';
import Location from './components/Location';
import { PageNotFound } from './components/PageNotFound';

export function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Adminlogin" element={<AdminLogin />} />
        <Route path="/UserLogin" element={<UserLogin />} />
        <Route path="/Admin" element={<Admin />} />
        <Route path="/User" element={<User />} />
        <Route path="/UserRegistration" element={<UserRegistration />} />
        <Route path="/Location" element={<Location />} />
        <Route path="/Office" element={<Office />} />
        <Route path="Admin/Location" element={<Location />} />
        <Route path="Admin/Office" element={<Office />} />   
        <Route path="UserRegistration/userlogin" element={<UserLogin />} />        
        <Route path="/PageNotFound" element={<PageNotFound />} />        
        <Route path='*' element={<PageNotFound />} />
        <Route path="Admin/Location" element={<Location />} />
      </Routes>
    </>
  );
}
export default App;