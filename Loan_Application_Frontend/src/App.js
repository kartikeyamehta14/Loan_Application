import logo from './logo.svg';
import './App.css';
import CustomerRegistration from './components/CustomerRegistration';
import CustomerLogin from './components/CustomerLogin';
import CustomerLoan from './components/CustomerLoan'
import Dashboard from './components/Dashboard'
import CustomerLoanStatusTable from './components/CustomerLoanStatusTable'
import {  Router, Route,Link,Routes } from 'react-router-dom';


function App() {
  return (
 <div>
      
    
    <div>
      <Routes>
      <Route path="/*" element={<CustomerLogin />} />
        <Route path="/registration" element={<CustomerRegistration />} />
        <Route path="/login" element={<CustomerLogin />} />
        <Route path="/loan" element={<CustomerLoan />} />
        <Route path="/loan-status" element={<CustomerLoanStatusTable />} />
        <Route path="/dashboard" element={<Dashboard/>} />
        
      </Routes>
    </div>
    </div>
  );
}

export default App;
